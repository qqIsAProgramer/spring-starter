package com.qyl.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: qyl
 * @Date: 2021/2/18 16:02
 * @Description:
 */
public interface FileService {

    /**
     * 上传头像
     * @param file
     * @return
     */
    String uploadAvatar(MultipartFile file);
}
