package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication()
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		//PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

//		// Mã hóa mật khẩu
//		String rawPassword = "user";
//		String encodedPassword = passwordEncoder.encode(rawPassword);
//
//		// In ra mật khẩu đã mã hóa
//		System.out.println("Mật khẩu gốc: " + rawPassword);
//		System.out.println("Mật khẩu đã mã hóa: " + encodedPassword);
	}

}
