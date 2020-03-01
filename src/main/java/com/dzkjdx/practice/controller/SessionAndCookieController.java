package com.dzkjdx.practice.controller;

import com.dzkjdx.practice.Const.UserConst;
import com.dzkjdx.practice.pojo.User;
import com.dzkjdx.practice.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

@Controller
@RequestMapping("/sessionAndCookie")
public class SessionAndCookieController {
    @RequestMapping("/session")
    @ResponseBody
    public ResponseVo test(HttpSession session){
        User user = (User) session.getAttribute(UserConst.CURRENT_USER);
        if(user == null){
            return new ResponseVo(-1, "Controller方法：需要登陆");
        }
        return new ResponseVo<User>(1, "返回session", user);
    }

    @RequestMapping("/login")
    @ResponseBody
    public ResponseVo login(HttpSession session){
        User user = new User();
        user.setName("jsb");
        user.setPassword("123");
        user.setMobile("567123");
        session.setAttribute(UserConst.CURRENT_USER, user);
        return new ResponseVo(1, "成功登陆");
    }
}
