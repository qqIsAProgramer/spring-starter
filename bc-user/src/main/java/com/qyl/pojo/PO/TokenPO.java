package com.qyl.pojo.PO;

import com.qyl.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: qyl
 * @Date: 2021/2/17 19:04
 * @Description: token 与 user 包装类
 */
@Data
@AllArgsConstructor
public class TokenPO {

    /**
     * 用户对应的 token
     */
    private String token;

    /**
     * 用户
     */
    private User user;
}
