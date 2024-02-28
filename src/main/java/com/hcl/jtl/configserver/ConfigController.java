package com.hcl.jtl.configserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

	@GetMapping
	public String checkConfigServer() {
		return "Config server is running";
	}
}
