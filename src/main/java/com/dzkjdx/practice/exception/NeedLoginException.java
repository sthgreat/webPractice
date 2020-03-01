package com.dzkjdx.practice.exception;

public class NeedLoginException extends RuntimeException {
    @Override
    public String getMessage() {
        return "现在未登陆，需要登陆";
    }
}
