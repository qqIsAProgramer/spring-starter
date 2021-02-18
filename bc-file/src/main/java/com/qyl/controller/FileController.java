package com.qyl.controller;

import com.qyl.entity.ResponseEntity;
import com.qyl.service.FileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @Author: qyl
 * @Date: 2021/2/18 16:13
 * @Description:
 */
@RestController
public class FileController {

    @Resource
    private FileService fileService;

    /**
     * 上传头像
     * @param multipartFile
     * @return
     */
    @PostMapping("/file/upload/avatar")
    public ResponseEntity<String> uploadAvatar(MultipartFile multipartFile) {
        return fileService.uploadAvatar(multipartFile);
    }
}
