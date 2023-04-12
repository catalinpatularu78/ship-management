package com.myproject.ship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShipSpringApplication {

//	@Override
//	public SpringApplicationBuilder configure(SpringApplicationBuilder app) {
//		return app.sources(ShipSpringApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(ShipSpringApplication.class, args);
	}

}
