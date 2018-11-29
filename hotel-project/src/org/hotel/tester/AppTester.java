package org.hotel.tester;

import org.hotel.bean.HotelBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTester {

	public static void main(String[] args) {

		String config = "context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		HotelBean bean = context.getBean(HotelBean.class);

		// HotelBean bean = context.getBean("hotel",HotelBean.class);

		bean.eating();

		System.out.println(bean.getHotelName());
		System.out.println(bean.getLocation());
		System.out.println(bean.getNoOfBranches());
		System.out.println(bean.getRating());

	}
}
