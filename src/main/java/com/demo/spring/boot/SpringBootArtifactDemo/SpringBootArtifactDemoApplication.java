package com.demo.spring.boot.SpringBootArtifactDemo;

import com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

//@Configuration // Cette annotation marque cette classe comme une classe de configuration Spring.
//@EnableScheduling // Cette annotation active la planification des tâches dans l'application.
@SpringBootApplication // Cette annotation marque cette classe comme une application Spring Boot et active la configuration automatique de Spring Boot.

//@ComponentScan({"com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository","com.demo.spring.boot.SpringBootArtifactDemo.services"})
public class SpringBootArtifactDemoApplication {

	public static void main(String[] args) {
		/*
		String[] beanNames = beanFactory.getBeanNamesForType(CityRepository.class);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
         */

		ApplicationContext context =SpringApplication.run(SpringBootArtifactDemoApplication.class, args);



	}


}
