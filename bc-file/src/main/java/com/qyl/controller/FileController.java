package com.qyl.controller;

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
     * @param file
     * @return
     */
    @PostMapping("/file/upload/avatar")
    public String uploadAvatar(MultipartFile file) {
        return fileService.uploadAvatar(file);
    }
}
