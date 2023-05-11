package com.InversionOfControl.InversionOfControl;

import com.InversionOfControl.InversionOfControl.services.RestaurantService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InversionOfControlSpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(InversionOfControlSpringApplication.class, args);

		RestaurantService restaurantService = applicationContext.getBean(RestaurantService.class);
		restaurantService.processOrder();
	}

}
