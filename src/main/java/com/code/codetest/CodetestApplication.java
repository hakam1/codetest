package com.code.codetest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.localtime.CurrentLocalTime;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
@CrossOrigin("http://localhost:8080")
public class CodetestApplication {

	final String TIME_ZONE_VALUE = "Europe/Berlin";

	@RequestMapping("/v1/currentTime")
	CurrentLocalTime getCurrentTime() {

		ZoneId zoneId = ZoneId.of(TIME_ZONE_VALUE);
		LocalDateTime localDateTime = LocalDateTime.now(zoneId);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
		String formattedTime = localDateTime.format(formatter);

		System.out.println("Current time of the day in Los Angeles: " + formattedTime);

		return new CurrentLocalTime(formattedTime, TIME_ZONE_VALUE);

	}

	public static void main(String[] args) {
		SpringApplication.run(CodetestApplication.class, args);
	}

}
