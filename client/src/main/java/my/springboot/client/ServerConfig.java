package my.springboot.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServerConfig {

	@Value("${msg:default}")
	private String value;

	@Value("${password:invalid}")
	private String password;

	public String getValue() {
		return value;
	}

	public String getPassword() {
		return password;
	}
}
