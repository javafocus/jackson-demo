package com.java.jacksondemo.config;

/*
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.context.annotation.Bean;
*/
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

@Configuration
public class DemoConfig {


    /* Enable this you wish to set naming strategy in objectMapper*/
    /*@Bean
    @Primary
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        return objectMapper;
    }*/
}
