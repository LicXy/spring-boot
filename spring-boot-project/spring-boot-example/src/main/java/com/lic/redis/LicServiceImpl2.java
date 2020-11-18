package com.lic.redis;

public class LicServiceImpl2 {
	public LicServiceImpl2() {
		System.out.println("LicServiceImpl2:已通过ImportSelector注入!!!");
	}
	public void testService(){
		System.out.println("LicServiceImpl2:通过ImportSelector导入");
	}
}
