package com.study.controller.cnu;

import com.study.domain.cnu.CnuPost;
import com.study.repository.mybatis.CnuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by rokim on 2016. 5. 15..
 */
@Controller
@RequestMapping("/post")
public class CnuPostController {
    @Autowired
    private CnuRepository cnuRepository;

    @RequestMapping("")
    public String index() {
        List<CnuPost> cnuPostList = cnuRepository.selectCnuPostList();

        return "post/index";
    }

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String write() {
        return "post/write";
    }

    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String doWrite(CnuPost cnuPost) {
        System.out.println("========");
        System.out.println(cnuPost.getAuthor());
        System.out.println(cnuPost.getContent());
        System.out.println("========");
        System.out.println("========");
        return "redirect:/post/write";
    }

    @RequestMapping("/view")
    public String view() {
        return "post/view";
    }
}
