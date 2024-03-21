package com.treug.aopafterreturning.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.treug.aopafterreturning")
@EnableAspectJAutoProxy
public class MyConfig {
}
