package com.lic.redis;

public class LicServiceImpl3 {
	public LicServiceImpl3() {
		System.out.println("LicServiceImpl3:已通过ImportBeanDefinitionRegistrar注入!!!");
	}
	public void testService(){
		System.out.println("LicServiceImpl3:通过ImportBeanDefinitionRegistrar导入");
	}
}
