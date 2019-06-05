package com.java.jacksondemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.java.jacksondemo.config.JacksonDemoProperties.PREFIX;

@ConfigurationProperties(prefix = PREFIX)
public class JacksonDemoProperties {

    public static final String PREFIX = "jackson.demo";

    private boolean serializeSensitiveInfo;

    public boolean isSerializeSensitiveInfo() {
        return serializeSensitiveInfo;
    }

    public void setSerializeSensitiveInfo(boolean serializeSensitiveInfo) {
        this.serializeSensitiveInfo = serializeSensitiveInfo;
    }
}
