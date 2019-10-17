package com.grain.manage.controller.util;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

public class PmsUploadUtil {
    public static String uploadImg(MultipartFile multipartFile) {
        String url = "http://192.168.26.128";
        try {
            String   tracker = ResourceUtils.getFile("classpath:tracker.conf").getPath();
            // 配置fdfs的全局链接地址
            //= DemoApplication.class.getResource("/tracker.conf").getPath();// 获得配置文件的路径
            ClientGlobal.init(tracker);

            TrackerClient trackerClient = new TrackerClient();

            // 获得一个trackerServer的实例
            TrackerServer trackerServer = trackerClient.getConnection();

            // 通过tracker获得一个Storage链接客户端
            StorageClient storageClient = new StorageClient(trackerServer,null);

            byte[] bytes = multipartFile.getBytes();
            String filename=multipartFile.getOriginalFilename();
            int i =filename.lastIndexOf(".");
            String exfile=filename.substring(i+1);

            String[] uploadInfos = storageClient.upload_file(bytes, exfile, null);



            for (String uploadInfo : uploadInfos) {
                url += "/"+uploadInfo;
                //url = url + uploadInfo;
            }

        } catch (Exception e) {

        }
        return url;
    }
}
