package com.java.jacksondemo.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.java.jacksondemo.model.UserDetails;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableConfigurationProperties(JacksonDemoProperties.class)
public class DemoConfig {


    @Bean
    @Primary
    public ObjectMapper objectMapper(JacksonDemoProperties demoProperties) {
        ObjectMapper objectMapper = new ObjectMapper();
        // should be set when you create custom ObjectMapper because setting the property in application.properties won't be considered
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.KEBAB_CASE);
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(UserDetails.class, new UserDetailsSerializer(demoProperties));
        objectMapper.registerModule(simpleModule);
        return objectMapper;
    }
}
