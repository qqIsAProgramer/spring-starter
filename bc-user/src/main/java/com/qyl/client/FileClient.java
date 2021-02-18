package com.qyl.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: qyl
 * @Date: 2021/2/18 16:07
 * @Description:
 */
@FeignClient("file")
public interface FileClient {

    /**
     * 头像上传（微服务间的通信）
     * 注意：使用 openfeign 传递参数含有文件类型时必须指定 consumes = MediaType.MULTIPART_FORM_DATA_VALUE
     * @param file
     * @return
     */
    @PostMapping(value = "/file/upload/avatar", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadAvatar(@RequestPart("file") MultipartFile file);
}
