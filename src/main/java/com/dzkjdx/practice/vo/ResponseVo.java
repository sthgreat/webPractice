package com.dzkjdx.practice.vo;

import lombok.Data;

@Data
public class ResponseVo<T> {
    private Integer status;
    private String msg;
    private T data;

    public ResponseVo(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResponseVo(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
