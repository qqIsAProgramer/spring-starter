package com.qyl.service.impl;

import com.qyl.service.FileService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author: qyl
 * @Date: 2021/2/18 16:02
 * @Description:
 */
@Service
public class FileServiceImpl implements FileService {

    @Value("${server.port}")
    private int port;

    @Value("${upload.dir.avatar}")
    private String avatarPath;

    @Override
    public String uploadAvatar(MultipartFile file) {
        // 1. 修改文件名
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String newFilename = UUID.randomUUID().toString() + "." + ext;
        // 2. 文件上传
        try {
            file.transferTo(new File(avatarPath, newFilename));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        // 3. 返回url
        String url = "http://localhost:" + port + "/" + newFilename;
        return url;
    }
}
