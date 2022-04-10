package com.woniu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(value = {"com.woniu"})
@EnableAspectJAutoProxy
@Configuration
public class MyConfig {
}
