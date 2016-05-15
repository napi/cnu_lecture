package com.study.controller.cnu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rokim on 2016. 5. 15..
 */
@Controller
@RequestMapping("/post")
public class CnuPostController {
    @RequestMapping("")
    public String index() {
        return "post/index";
    }

    @RequestMapping("/write")
    public String write() {
        return "post/write";
    }

    @RequestMapping("/view")
    public String view() {
        return "post/view";
    }
}
