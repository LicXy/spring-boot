package com.lic.redis;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 实现ImportBeanDefinitionRegistrar, 重写registerBeanDefinitions方法注册bean
 */
public class LicImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition beanDefinition = new RootBeanDefinition(LicServiceImpl3.class);
		registry.registerBeanDefinition("licServiceImpl3",beanDefinition);
	}
}
