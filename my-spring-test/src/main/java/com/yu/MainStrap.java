package com.yu;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStrap {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println(applicationContext.getBean(ILogin.class).loginCheck("1", "ss"));
	}
}
