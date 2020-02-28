package com.dzkjdx.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class freeMakerTestController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","你好世界！");
        model.addAttribute("name", "jsb");
        return "HelloWorld";
//        Map<String,String> map = new HashMap<>();
//        map.put("name", "jsb");
//        map.put("msg","你好世界!");
//        return new ModelAndView("HelloWorld",map);
    }
}
