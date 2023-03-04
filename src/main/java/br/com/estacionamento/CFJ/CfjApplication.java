package br.com.estacionamento.CFJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController
@SpringBootApplication
public class CfjApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfjApplication.class, args);
	}

}
