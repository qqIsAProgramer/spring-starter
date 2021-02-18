package com.qyl.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: qyl
 * @Date: 2021/2/17 20:02
 * @Description:
 */
@Data
@Table(name = "user")
public class User {
    /**
     * 用户ID
     */
    @Id  // 代表主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // id自增长
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户头像存储路径
     */
    private String avatar;

    /**
     * 用户创建时间
     */
    private Date createTime;
}
