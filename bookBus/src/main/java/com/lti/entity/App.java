package com.lti.entity;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lti.interfaces.CityInterface;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		CityInterface c = (CityInterface) context.getBean("city");
		City city = new City();
		city.setCity("Pune");
		c.addCity(city);

	}
}
