package com.lzp.mySpring;

public class FactoryMethodBean {
	private FactoryMethodBean() {
	}

	private static class InnerClass {
		static FactoryMethodBean instance = new FactoryMethodBean();
	}

	public static FactoryMethodBean getInstance() {
		
		return InnerClass.instance;

	}
}
