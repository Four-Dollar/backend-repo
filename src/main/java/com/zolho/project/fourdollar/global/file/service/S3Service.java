package com.zolho.project.fourdollar.global.file.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @package : com.zolho.project.fourdollar.global.file.service
 * @name : S3Service
 * @create-date: 2022.11.26
 * @author : 김현진
 * @version : 1.0.0
 *
 * @update-date : 2022.11.30
 * @update-author : 김현진
 * @update-description :
 */

@Service
@RequiredArgsConstructor
public class S3Service {
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    private final AmazonS3 amazonS3;

    public List<String> uploadFile(List<MultipartFile> multipartFile) {
        List<String> urlList = new ArrayList<>();

        for (MultipartFile file : multipartFile) {
            String fileName = createFileName(file.getOriginalFilename());
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.setContentLength(file.getSize());
            objectMetadata.setContentType(file.getContentType());

            try (InputStream inputStream = file.getInputStream()) {
                amazonS3.putObject(new PutObjectRequest(bucket + "/used-goods/file", fileName, inputStream, objectMetadata)
                        .withCannedAcl(CannedAccessControlList.PublicRead));
                urlList.add(amazonS3.getUrl(bucket + "/used-goods/file", fileName).toString());
            } catch (IOException e) {
                System.out.println("예외처리");
            }
        }
        return urlList;
    }

    // 이미지 파일명 중복 방지 위해 UUID 추가
    private String createFileName(String fileName){
        return UUID.randomUUID().toString().concat(getFileExtension(fileName));
    }

    // 파일 유효성 검사
    private String getFileExtension(String fileName) {
        if (fileName.length() == 0) {
            System.out.println("예외처리");
        }
        // 파일 형식
        ArrayList<String> fileValidate = new ArrayList<>();
        fileValidate.add(".jpg");
        fileValidate.add(".jpeg");
        fileValidate.add(".png");
        fileValidate.add(".JPG");
        fileValidate.add(".JPEG");
        fileValidate.add(".PNG");
        fileValidate.add(".svg");
        fileValidate.add(".SVG");
        fileValidate.add(".ico");
        fileValidate.add(".ICO");

        String idxFileName = fileName.substring(fileName.lastIndexOf("."));
        if(!fileValidate.contains(idxFileName)) {
            System.out.println("없음");
        }
        return fileName.substring(fileName.lastIndexOf("."));
    }
}
