package com.zolho.project.fourdollar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FourdollarApplication {
	public static void main(String[] args) {
		SpringApplication.run(FourdollarApplication.class, args);
	}

}
