package com.dzkjdx.practice.controller;

import com.dzkjdx.practice.vo.ResponseVo;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/param")
public class parameController {
    @RequestMapping("/test1")
    public ResponseVo paramTest(@RequestParam("name") String s){//接受在url中的参数
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.toString();
        return new ResponseVo(0,"参数测试", s1);
    }

    @RequestMapping("/test2")
    public ResponseVo paramTest2(HttpServletRequest request){
        String name = request.getHeader("name");
        return new ResponseVo(0,"参数测试2", name);
    }
}
