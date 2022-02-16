package com.formacionspring.app.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ApiRestEjercicioIndividualApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiRestEjercicioIndividualApplication.class, args);
	}

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	

	@Override
	public void run(String...args) throws Exception{
		String password = "12345";
		
		for(int i=0; i<2; i++) {
			String passwordBcrypt= passwordEncoder.encode(password);
			
			System.out.println(passwordBcrypt);
		}
	}
	
	
}
