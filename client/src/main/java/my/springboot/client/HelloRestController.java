package my.springboot.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@Autowired
	ServerConfig serverConfig;

	@GetMapping("/hello")
	public String hello() {
		return serverConfig.getValue();
	}

	@GetMapping("/password")
	public String password() {
		return serverConfig.getPassword();
	}

}
