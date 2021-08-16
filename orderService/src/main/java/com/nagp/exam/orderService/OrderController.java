package com.nagp.exam.orderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@GetMapping("/showOrder/{id}")
	public String showOrder() {
		return "Order is created";
	}

}
