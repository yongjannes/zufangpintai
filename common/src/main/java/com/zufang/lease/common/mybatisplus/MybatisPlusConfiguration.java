package com.zufang.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: MybatisPlusConfiguration
 * @Author 殇枫
 * @Package com.zufang.lease.common.mybatisplus
 * @Date 2025/7/27
 * @description:
 */
@Configuration
@MapperScan("com.zufang.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}