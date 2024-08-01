package com.starry.spring.config;

import com.starry.spring.annotation.importbeandefinitionregistart.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author shaoyongxing
 * @date 11.3.23 7:42 下午
 **/
@ComponentScan(value = "com.starry.spring.annotation")
@Import(MyImportBeanDefinitionRegistrar.class)
public class StarryConfig {
}
