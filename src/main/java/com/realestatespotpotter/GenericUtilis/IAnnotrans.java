package com.realestatespotpotter.GenericUtilis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class IAnnotrans implements IAnnotationTransformer
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {
		annotation.setRetryAnalyzer(com.realestatespotpotter.GenericUtilis.RetryImpclass.class);
	}

}
