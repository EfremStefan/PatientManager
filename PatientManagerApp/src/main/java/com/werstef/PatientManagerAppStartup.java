package com.werstef;

import com.werstef.Home.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientManagerAppStartup {

	private HomeController homeController;

	public static void main(String[] args) {
		SpringApplication.run(PatientManagerAppStartup.class, args);
	}

}
