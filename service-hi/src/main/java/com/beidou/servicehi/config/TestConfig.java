package com.beidou.servicehi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author beidou
 * @since 18/6/27
 */
@Configuration
@ConfigurationProperties(prefix = "com.beidou")
//PropertySource 不支持yml配置文件
@PropertySource(value = "classpath:beidou.properties")
public class TestConfig {

    private String frameWork;

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }
}
