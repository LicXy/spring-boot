package com.lic.redis;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration   //配置类标识注解
@Import({LicSelector.class,LicImportBeanDefinitionRegistrar.class})  //组件导入注解
public class LicConfig {
}
