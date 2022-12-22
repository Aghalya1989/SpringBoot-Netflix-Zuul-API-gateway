package com.spring.Serverfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerFirstController {
	@GetMapping("/admin")
	public String admin() {
		return "<h1>This is admin page of ServerFirst</h1>";

	}

	@GetMapping("/user")
	public String user() {
		return "<h1>This is user page of ServerFirst</h1>";
	}

}
