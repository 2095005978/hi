package com.example.spring_mvc03.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 用来替换beans.xml配置文件
 */
@Configuration
@ComponentScan("com")
public class SpringConfig {
}
