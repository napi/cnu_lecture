package com.study.controller.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by rokim on 2016. 5. 15..
 */
@Controller
@RequestMapping("/tutorial")
public class TutorialController {

    @RequestMapping("/step1")
    public ModelAndView step1(@RequestParam String name) {
        ModelAndView mav = new ModelAndView();

        Map<String, Object> model = mav.getModel();
        model.put("name", name);

        mav.setViewName("/tutorial/step1");

        return mav;
    }

    @RequestMapping("/step2")
    public ModelAndView step2(@RequestParam String name, Model model) {
        ModelAndView mav = new ModelAndView();

        model.addAttribute("name", name);

        mav.setViewName("/tutorial/step1");

        return mav;
    }

    @RequestMapping("/step3")
    public String step3(@RequestParam String name, @RequestParam String[] names, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("nameList", names);

        return "/tutorial/step1";
    }

}
