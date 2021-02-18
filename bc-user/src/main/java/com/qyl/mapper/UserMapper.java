package com.qyl.mapper;

import com.qyl.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author: qyl
 * @Date: 2021/2/17 19:58
 * @Description:
 */
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    /* 通过用户名获取用户 */
    User selectByName(String username);

    /* 通过手机号获取用户 */
    User selectByPhone(String phone);
}
