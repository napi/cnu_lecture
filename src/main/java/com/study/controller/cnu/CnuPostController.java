package com.study.controller.cnu;

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
import scala.Int;

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
    public String view(@RequestParam(required = false) String postId, Model model) {

        CnuPost cnuPost = cnuRepository.selectCnuPost(Integer.parseInt(postId));
        List <CnuPostComment> cnuPostCommentList = cnuRepository.selectCnuPostCommentList(Integer.parseInt(postId));

        model.addAttribute("cnuPostCommentList", cnuPostCommentList);
        model.addAttribute("cnuPost", cnuPost);

        return "post/view";
    }

    @RequestMapping("/delete")
    public String delete(int postId, String password) {


        return "post/view";
    }

}
