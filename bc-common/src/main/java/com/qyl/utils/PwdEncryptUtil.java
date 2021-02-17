package com.qyl.utils;

import org.apache.tomcat.util.security.MD5Encoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * @Author: qyl
 * @Date: 2021/2/17 19:27
 * @Description: 密码加密工具类
 */
public class PwdEncryptUtil {

    /**
     * 密码加密
     * @param password
     * @return
     * @throws Exception
     */
    public static String encodeByMD5(String password) throws Exception {
        // 确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return MD5Encoder.encode(md5.digest(password.getBytes(StandardCharsets.UTF_8)));
    }
}
