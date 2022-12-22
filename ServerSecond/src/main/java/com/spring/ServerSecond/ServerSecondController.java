package com.spring.ServerSecond;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerSecondController {
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>This is admin page of ServerSecond</h1>";

	}

	@GetMapping("/user")
	public String user() {
		return "<h1>This is user page of ServerSecond</h1>";
	}

}
