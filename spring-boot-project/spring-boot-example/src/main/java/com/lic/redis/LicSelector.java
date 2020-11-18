package com.lic.redis;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

public class LicSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		return new String[]{"com.lic.redis.LicServiceImpl","com.lic.redis.LicServiceImpl2"};
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
