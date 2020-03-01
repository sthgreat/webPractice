package com.dzkjdx.practice.Interceptor;

import com.dzkjdx.practice.Const.UserConst;
import com.dzkjdx.practice.exception.NeedLoginException;
import com.dzkjdx.practice.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(UserConst.CURRENT_USER);
        if(user == null){
            throw new NeedLoginException();
        }
        return true;
    }
}
