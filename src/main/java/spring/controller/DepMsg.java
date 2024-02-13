package spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepMsg {
	
	@GetMapping("/msg")
	public String msg() {
		return "Congratulations!! You are live";
	}
}
