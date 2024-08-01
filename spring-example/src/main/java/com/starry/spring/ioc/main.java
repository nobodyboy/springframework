package com.starry.spring.ioc;

import com.starry.spring.ioc.service.UserService;
import com.starry.spring.ioc.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaoyongxing
 * @date 7.1.22 9:36 上午
 **/
@ComponentScan(value = "com.starry.spring.ioc")
public class main {
	public static void main(String[] args) {
		// 首个例子，能打印bean表明编译成功
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		applicationContext.register(UserServiceImpl.class);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
		applicationContext.refresh();
		UserService bean = applicationContext.getBean(UserServiceImpl.class);
		System.out.println(bean);
	}
}
