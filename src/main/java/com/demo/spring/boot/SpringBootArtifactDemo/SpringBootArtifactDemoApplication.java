package com.demo.spring.boot.SpringBootArtifactDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Cette annotation marque cette classe comme une application Spring Boot et active la configuration automatique de Spring Boot.
@Configuration // Cette annotation marque cette classe comme une classe de configuration Spring.
@EnableScheduling // Cette annotation active la planification des tâches dans l'application.

public class SpringBootArtifactDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootArtifactDemoApplication.class, args);
	}

	@Bean // annotation qui indique que la méthode suivante retourne un objet qui doit être géré par Spring
	public MyBean myBean() {
		return new MyBean();
	}

	@ConfigurationProperties(prefix = "my") // annotation qui indique que les propriétés de configuration commençant par "my" doivent être injectées dans cette classe
	@Component // annotation qui indique que cette classe doit être gérée par Spring
	public class MyConfiguration {
		private String property1;
		private int property2;

		// Getters et setters pour les propriétés

		public String getProperty1() {
			return property1;
		}

		public void setProperty1(String property1) {
			this.property1 = property1;
		}

		public int getProperty2() {
			return property2;
		}

		public void setProperty2(int property2) {
			this.property2 = property2;
		}
	}

	@RestController // annotation qui indique que cette classe est un contrôleur REST
	public class MyController {

		@Autowired // annotation qui indique que le bean suivant doit être injecté
		private MyBean myBean;

		@GetMapping("/hello") // annotation qui indique que cette méthode est accessible via une requête HTTP GET à l'URL "/hello"
		public String hello() {
			return "Hello, world!";
		}

		@GetMapping("/my-bean") // annotation qui indique que cette méthode est accessible via une requête HTTP GET à l'URL "/my-bean"
		public MyBean getMyBean() {
			return myBean;
		}
	}

	public class MyBean {
		// Code pour la classe MyBean
	}

}
