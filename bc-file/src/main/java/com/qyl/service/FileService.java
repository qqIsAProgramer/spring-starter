package com.qyl.service;

import com.qyl.entity.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: qyl
 * @Date: 2021/2/18 16:02
 * @Description:
 */
public interface FileService {

    /**
     * 上传头像
     * @param multipartFile
     * @return
     */
    ResponseEntity<String> uploadAvatar(MultipartFile multipartFile);
}
