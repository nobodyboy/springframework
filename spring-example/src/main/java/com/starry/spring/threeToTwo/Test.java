package com.starry.spring.threeToTwo;

import com.starry.spring.threeToTwo.config.ModelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 24.4.22 11:44 下午
 *
 *
 * 注入模型对bean的实例化影响
 **/
public class Test {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ModelConfig.class);
		context.register(ModelBeanFactoryPostProcessor.class);
		context.refresh();
	}
}
