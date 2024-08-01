package com.starry.spring.threeToTwo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 24.4.22 11:57 下午
 * Bean的后置处理器
 **/
public class ModelBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition beanDefinition =  (AbstractBeanDefinition) beanFactory.getBeanDefinition("aa");

		// 改变A对象的注入模型
		beanDefinition.setAutowireMode(3);
	}
}
