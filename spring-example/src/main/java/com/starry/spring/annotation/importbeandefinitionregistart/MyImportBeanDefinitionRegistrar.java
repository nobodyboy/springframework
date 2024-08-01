package com.starry.spring.annotation.importbeandefinitionregistart;

import com.starry.spring.annotation.beanFactoryPp.TestBeanFactoryPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author shaoyongxing
 * @date 12.3.23 10:53 上午
 * 可以动态的把bean生成一个beanDefinition,然后注册到容器内
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println("MyImportBeanDefinitionRegistrar .....");
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TestBeanFactoryPostProcessor.class);
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		registry.registerBeanDefinition("testBeanFactoryPostProcessor", beanDefinition);
	}
}
