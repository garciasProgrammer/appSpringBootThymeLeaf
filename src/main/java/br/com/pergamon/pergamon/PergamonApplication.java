package br.com.pergamon.pergamon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PergamonApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PergamonApplication.class, args);
               
               
	}

}
