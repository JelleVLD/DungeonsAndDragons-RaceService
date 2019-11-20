package com.thomasmore.RaceService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@RestController
public class RaceServiceApplication {

	private static Logger log = LoggerFactory.getLogger(RaceServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RaceServiceApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String home() {
		log.info("Access /(niets dus hi)");
		return "Hi!ssss8001";
	}

	@RequestMapping(value = "/greeting")
	public String greet() {
		log.info("Access /greeting");

		List<String> greetings = Arrays.asList("Hi there8001", "Greetings8001", "Salutations8001");
		Random rand = new Random();

		int randomNum = rand.nextInt(greetings.size());
		return greetings.get(randomNum);
	}

}
