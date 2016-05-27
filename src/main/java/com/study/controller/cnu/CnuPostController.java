package com.study.controller.cnu;

import com.study.domain.cnu.CnuComment;
import com.study.domain.cnu.CnuPost;
import com.study.domain.cnu.CnuPostComment;
import com.study.repository.jdbc.CnuJdbcRepository;
import com.study.repository.mybatis.CnuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by rokim on 2016. 5. 15..
 */
@Controller
@RequestMapping("/post")
public class CnuPostController {
    @Value("${application.security.salt}") private String securityKey;

    @Autowired
    CnuRepository cnuRepository;

    @RequestMapping("")
    public String index(Model model) {
        List<CnuPost> cnuPostList = cnuRepository.selectCnuPostList();
        model.addAttribute("cnuPostList", cnuPostList);
        return "post/index";
    }

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String write() {
        return "post/write";
    }

    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String doWrite(String title,
                          String content,
                          String author,
                          String password) {

        CnuPost cnuPost = new CnuPost();
        cnuPost.setTitle(title);
        cnuPost.setAuthor(author);
        cnuPost.setPassword(password);
        cnuPost.setContent(content);

        cnuRepository.insertCnuPost(cnuPost);

        return "redirect:/post";
    }

    @RequestMapping(value = "/view")
    public String view(@RequestParam int postId, Model model) {
    	CnuPost cnuPost = cnuRepository.selectCnuPost(postId);
    	if(cnuPost.isDel())
    	{
    		return "redirect:/post";
    	}
        cnuPost.increaseViewCount();
		model.addAttribute("cnuPost", cnuPost); 
		
		cnuPost.setContent(cnuPost.getContent().replace("\r\n", "<br>"));
		
        List<CnuComment> cnuCommentList = cnuRepository.selectCnuCommentList(postId);
        model.addAttribute("cnuCommentList", cnuCommentList);

        cnuRepository.increaseViewCount(cnuPost);
        

        return "post/view";
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public String doWriteComment(int postId,String nick_name,String password,String comment) {
    	CnuPostComment PostComment = new CnuPostComment();
    	PostComment.setPostId(postId);
    	PostComment.setAuthor(nick_name);
    	PostComment.setPassword(password);
    	PostComment.setComment(comment);

        cnuRepository.insertCnuPostComment(PostComment);
        

        return "redirect:/post/view?postId="+postId;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(int postId, String password) {

        CnuPost cnuPost = new CnuPost();
        cnuPost.setPassword(password);
        cnuPost.setPostId(postId);
        cnuPost.setIsDel(true);

        CnuPost myRepository = cnuRepository.selectCnuPost(postId);
        if(myRepository == null){
            return "redirect:/post?emptyPost";
        }

        String chk_passowrd=myRepository.getPassword();

        if(chk_passowrd.equals(password))
        {
            cnuRepository.deleteCnuPost(cnuPost);
            return "redirect:/post";
        }
        return "redirect:/post?incorrectPassword";
    }


    @RequestMapping( value = "/deleteComment", method = RequestMethod.POST)
    public String deleteComment(int postId, int commentID, String password){
		CnuPostComment cnuPostComment = new CnuPostComment();
		cnuPostComment.setCommentId(commentID);
		cnuPostComment.setPassword(password);

		cnuRepository.deleteCnuPostComment(cnuPostComment);
    	return "redirect:/post/view?postId=" + postId;
    }

}
