package com.study.controller.cnu;

import com.study.domain.cnu.CnuComment;
import com.study.domain.cnu.CnuPost;
import com.study.domain.cnu.CnuPostComment;
import com.study.repository.mybatis.CnuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Created by rokim on 2016. 5. 15..
 */
@Controller
@RequestMapping("/post")
public class CnuPostController {
    @Value("${application.security.salt}")
    private String securityKey;

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
    
    /*
     * comment 작성 메소드 추가
     */
    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public String comment(@RequestParam int postId, String author, String password, String comment) {
    	CnuPostComment cnupostcomment = new CnuPostComment();
    	cnupostcomment.setAuthor(author);
    	cnupostcomment.setPassword(password);
    	cnupostcomment.setComment(comment);
    	cnupostcomment.setCreateTime(new Date());
    	cnupostcomment.setPostId(postId);
    	
    	cnuRepository.insertCnuPostComment(cnupostcomment);
		
    	return "redirect:/post/view?postId=" + cnupostcomment.getPostId();
    }

    @RequestMapping(value = "/view")
    public String view(@RequestParam int postId, Model model) {

        CnuPost cnuPost = cnuRepository.selectCnuPost(postId);
        List<CnuPostComment> cnuPostCommentList = cnuRepository.selectCnuPostCommentList(postId);
    	cnuRepository.updateViewCount(postId);


        List<CnuComment> cnuCommentList = cnuRepository.selectCnuCommentList(postId);

        model.addAttribute("cnuPost", cnuPost);
        model.addAttribute("cnuCommentList", cnuCommentList);

        return "post/view";
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

    @RequestMapping( value = "/commentDelete", method = RequestMethod.POST)
    public String deleteCnuComment(int postID, 
    								int commentID, 
    								String password){
    	CnuPostComment cnuPostComment = new CnuPostComment();
    	cnuPostComment.setPostId(postID);
    	cnuPostComment.setCommentId(commentID);
    	cnuPostComment.setPassword(password);

        cnuRepository.deleteCnuComment(cnuPostComment);
        return "redirect:/post/view";
    }

}
