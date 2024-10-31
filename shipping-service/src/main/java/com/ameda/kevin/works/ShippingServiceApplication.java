package com.ameda.kevin.works;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Objects;

@SpringBootApplication
public class ShippingServiceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
		System.setProperty("MONGO_URI", Objects.requireNonNull(dotenv.get("MONGO_URI")));
		SpringApplication.run(ShippingServiceApplication.class, args);
	}

	@Bean
	public Dotenv dotenv() {
		return Dotenv.configure().load();
	}

}
