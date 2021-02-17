package com.qyl.entity;

import com.qyl.enums.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: qyl
 * @Date: 2021/2/17 19:20
 * @Description: 响应统一返回体
 */
@Data
@AllArgsConstructor
public class ResponseEntity<T> {

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public static <T> ResponseEntity<T> ok() {
        return response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), null);
    }

    public static <T> ResponseEntity<T> ok(T data) {
        return response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), data);
    }

    public static <T> ResponseEntity<T> fail() {
        return response(ResponseEnum.FAIL.getCode(), ResponseEnum.FAIL.getMsg(), null);
    }

    public static <T> ResponseEntity<T> error(int code, String msg) {
        return response(code, msg, null);
    }

    public static <T> ResponseEntity<T> response(int code, String msg, T data) {
        return new ResponseEntity<>(code, msg, data);
    }
}
