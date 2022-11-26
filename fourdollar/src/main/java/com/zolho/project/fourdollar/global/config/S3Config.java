package com.zolho.project.fourdollar.global.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @package : com.zolho.project.fourdollar.global.config
 * @name : S3Config
 * @create-date: 2022.11.24
 * @author : 김현진
 * @version : 1.0.0
 *
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Configuration
public class S3Config {
    @Value("${cloud.aws.crenditials.access-key}")
    private String accessKey;

    @Value("${cloud.aws.credentials.access-key}")
    private String secretKey;

    @Value("${cloud.aws.region.static}")
    private String region;

    public AmazonS3 amazonS3Clinet(){
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
        return AmazonS3ClientBuilder.standard()
                .withRegion(region)
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
