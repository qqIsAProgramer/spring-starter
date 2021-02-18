package com.qyl.controller;

import com.qyl.entity.ResponseEntity;
import com.qyl.pojo.PO.TokenPO;
import com.qyl.pojo.User;
import com.qyl.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.validation.constraints.Pattern;

/**
 * @Author: qyl
 * @Date: 2021/2/18 15:59
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     * @param user
     * @param verifyCode
     * @param multipartFile
     * @return
     */
    @PostMapping("/register")
    public ResponseEntity<Void> register(User user, String verifyCode, MultipartFile multipartFile) {
        return userService.register(user, verifyCode, multipartFile);
    }

    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    @GetMapping("/query/{username}")
    public ResponseEntity<User> queryUserByName(@PathVariable("username") String username) {
        return userService.queryUserByName(username);
    }

    /**
     * 发送验证码
     * @param phone
     * @return
     */
    @PostMapping("/send")
    public ResponseEntity<String> sendVerificationCode(
            @Pattern(regexp = "^1[35678]\\d{9}$", message = "手机格式不正确") String phone) {
        return userService.sendVerificationCode(phone);
    }

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity<TokenPO> login(String phone, String password) {
        return userService.login(phone, password);
    }

}
