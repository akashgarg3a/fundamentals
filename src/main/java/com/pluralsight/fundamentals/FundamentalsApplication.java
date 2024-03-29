package com.pluralsight.fundamentals;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(ApplicationRepository repository) {
//		return (args) ->{
//			repository.save(new Application("Trackzilla","kesha.williams","Application for tracking bugs."));
//			repository.save(new Application("Expenses","mary.jones","Application to track expense reports."));
//			repository.save(new Application("Notifications","karen.kane","Application to send alerts and notifications to users."));
//
//			for(Application application : repository.findAll()) {
//				System.out.println("The application is " + application.toString());
//			}
//		};
//	}
}
