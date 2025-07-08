package com.jyotishmoy.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		//This runs the Spring Boot app and gives you the Spring context, which holds all beans.
	 ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
	 //We ask Spring to give us an instance of OrderService (Spring will inject dependencies).
	   var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
