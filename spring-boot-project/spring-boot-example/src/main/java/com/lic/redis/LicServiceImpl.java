package com.lic.redis;

public class LicServiceImpl {
	public LicServiceImpl() {
		System.out.println("LicServiceImpl:已通过ImportSelector注入!!!");
	}

	public void testService(){
		System.out.println("LicServiceImpl:通过ImportSelector导入");
	}
}
