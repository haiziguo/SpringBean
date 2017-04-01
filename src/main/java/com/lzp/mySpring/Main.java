package com.lzp.mySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyBean myBean = (MyBean) context.getBean("myBean");
		
		MyBean2 myBean2 = (MyBean2) context.getBean("myBean2");
		System.out.println(myBean);
		System.out.println(myBean2.getIntProperty());
		System.out.println(myBean2.getMyBean());
		FactoryMethodBean factoryMethodBean = (FactoryMethodBean) context.getBean("factoryMethodBean");
		/*System.out.println(factoryMethodBean);
		 ((ClassPathXmlApplicationContext) context).close();*/
		
		MyBean3 myBean3 = (MyBean3) context.getBean("myBean3");
		System.out.println(myBean3.getMyBean());
		System.out.println(myBean3.getSimpleProperty().intValue());
		
		
		MyBean3 myBean4 = (MyBean3) context.getBean("myBean4");
		System.out.println(myBean4.getMyBean());
		System.out.println(myBean4.getSimpleProperty().intValue());
	}

}
