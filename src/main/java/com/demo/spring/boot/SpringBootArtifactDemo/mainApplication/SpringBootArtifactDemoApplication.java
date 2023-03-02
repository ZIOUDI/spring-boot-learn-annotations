package com.demo.spring.boot.SpringBootArtifactDemo.mainApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Configuration // Cette annotation marque cette classe comme une classe de configuration Spring.
//@EnableScheduling // Cette annotation active la planification des tâches dans l'application.

//@ComponentScan({"com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository","com.demo.spring.boot.SpringBootArtifactDemo.services"})
//@EnableJpaRepositories(basePackages = "com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository")
@SpringBootApplication // Cette annotation marque cette classe comme une application Spring Boot et active la configuration automatique de Spring Boot.
public class SpringBootArtifactDemoApplication {

	public static void main(String[] args) {

	 	ApplicationContext context =SpringApplication.run(SpringBootArtifactDemoApplication.class, args);

		 // Récupère tous les noms de beans dans le contexte
		String[] beanNames = context.getBeanDefinitionNames();

		// Boucle sur tous les noms de beans et vérifie leur type
		for (String beanName : beanNames) {
			Class<?> beanType = context.getType(beanName);
			if (beanType != null) {
				if (beanType.isAnnotationPresent(Controller.class)) {
					System.out.println(beanName + " est un contrôleur.");
				} else if (beanType.isAnnotationPresent(Service.class)) {
					System.out.println(beanName + " est un service.");
				} else if (beanType.isAnnotationPresent(Repository.class)) {
					System.out.println(beanName + " est un repository.");
				}
			}
		}


	}


}
