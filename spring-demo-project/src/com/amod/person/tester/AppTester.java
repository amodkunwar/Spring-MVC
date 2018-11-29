package com.amod.person.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amod.person.bean.PersonBean;

public class AppTester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		PersonBean personBean = context.getBean(PersonBean.class);
		personBean.breadth();
		System.out.println(personBean.getpName());
		System.out.println(personBean.getpAge());
		System.out.println(personBean.getAddress());
		System.out.println(personBean.getIsVeg());
	}

}
