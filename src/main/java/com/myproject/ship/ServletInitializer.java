package com.myproject.ship;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	public SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(ShipSpringApplication.class);
	}

}
