package com.zufang.lease.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Title: MinioProperties
 * @Author 殇枫
 * @Package com.zufang.lease.common.minio
 * @Date 2025/7/27
 * @description:
 */
@ConfigurationProperties(prefix = "minio")
@Data
public class MinioProperties {

    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucketName;
}