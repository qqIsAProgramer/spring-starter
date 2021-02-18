package com.qyl.service;

import com.qyl.entity.ResponseEntity;
import com.qyl.pojo.PO.TokenPO;
import com.qyl.pojo.User;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: qyl
 * @Date: 2021/2/18 15:47
 * @Description:
 */
public interface UserService {

    /**
     * 用户注册
     * @param user
     * @param verifyCode
     * @param multipartFile
     * @return
     */
    ResponseEntity<Void> register(User user, String verifyCode, MultipartFile multipartFile);

    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    ResponseEntity<User> queryUserByName(String username);

    /**
     * 发送验证码
     * @param phone
     * @return
     */
    ResponseEntity<String> sendVerificationCode(String phone);

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    ResponseEntity<TokenPO> login(String phone, String password);
}
