package com.zufang.lease.common.sms;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Title: AliyunSMSProperties
 * @Author 殇枫
 * @Package com.zufang.lease.common.sms
 * @Date 2025/7/28
 * @description:
 */
@Data
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliyunSMSProperties {

    private String accessKeyId;

    private String accessKeySecret;

    private String endpoint;
}