package com.treug.aoppointcuts.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.treug.aoppointcuts")
@EnableAspectJAutoProxy
public class MyConfig {
}
