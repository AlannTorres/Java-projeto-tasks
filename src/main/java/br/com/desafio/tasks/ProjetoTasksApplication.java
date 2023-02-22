package br.com.desafio.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

@Component
@EnableFeignClients
@SpringBootApplication
public class ProjetoTasksApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjetoTasksApplication.class, args);
	}
}
