package com.study.controller.cnu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rokim on 2016. 5. 15..
 */
@Controller
@RequestMapping("/board")
public class CnuBoardController {
    @RequestMapping("")
    public String index() {
        return "board/index";
    }

    @RequestMapping("/write")
    public String write() {
        return "board/write";
    }
}
