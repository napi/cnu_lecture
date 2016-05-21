package com.study.controller.cnu;

import com.study.domain.cnu.CnuPost;
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

    @RequestMapping("/view")
    public String view(@RequestParam int postId, Model model) {

        /**
         * Dummy CnuPost Start
         *
         * TODO
         * post의 detail view 를 담당한 조는 이 dummy 를 삭제하고 자신들이 개발한 코드를 넣어주세요.
         * 그 외에 삭제/comment 를 담당한 학생분들은 이 dummy 를 이용해서 CnuPost 모델을 가져온다고 생각하고 개발해주세요.
         */
        CnuPost cnuPost = new CnuPost();
        cnuPost.setTitle("Dummy Title");
        cnuPost.setContent("Dummy content");
        cnuPost.setAuthor("Dummy Author");
        cnuPost.setPassword("1111");
        cnuPost.setCreateTime(new Date());
        cnuPost.increaseViewCount();
        cnuPost.setPostId(postId);
        /** Dummy CnuPost END **/

        model.addAttribute("cnuPost", cnuPost);
        cnuRepository.increaseViewCount(cnuPost);
        return "post/view";
    }

    @RequestMapping("/delete")
    public String delete(int postId, String password) {


        return "post/view";
    }

}
