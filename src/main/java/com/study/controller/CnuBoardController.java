package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rokim on 2016. 5. 15..
 */
@Controller
@RequestMapping("/board")
public class CnuBoardController {
    @RequestMapping("")
    public String indexl() {
        return "board/index";
    }

}
