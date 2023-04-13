package com.myproject.ship.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ships")
public class ShipController {

	@GetMapping
	public String getAllShips() {

		return "Hello";

	}

}
