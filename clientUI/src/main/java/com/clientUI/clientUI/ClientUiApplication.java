package com.clientUI.clientUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.clientUI")
public class ClientUiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientUiApplication.class, args);
	}

}
