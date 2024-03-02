package com.treug.aopbefore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.treug.aopbefore")
@EnableAspectJAutoProxy
public class MyConfig {
}
