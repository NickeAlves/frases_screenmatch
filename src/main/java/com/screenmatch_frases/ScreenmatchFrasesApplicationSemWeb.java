package com.screenmatch_frases;

import com.screenmatch_frases.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchFrasesApplicationSemWeb implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchFrasesApplicationSemWeb.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		Principal principal = new Principal();
	}
}
