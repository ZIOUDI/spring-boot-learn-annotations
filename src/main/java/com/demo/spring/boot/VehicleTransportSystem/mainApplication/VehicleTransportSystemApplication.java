package com.demo.spring.boot.VehicleTransportSystem.mainApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@Configuration // Cette annotation marque cette classe comme une classe de configuration Spring.
//@EnableScheduling // Cette annotation active la planification des tâches dans l'application.

//@ComponentScan({"com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository","com.demo.spring.boot.SpringBootArtifactDemo.services"})
//@EnableJpaRepositories(basePackages = "com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository")
//@EnableSwagger2
@SpringBootApplication // Cette annotation marque cette classe comme une application Spring Boot et active la configuration automatique de Spring Boot.
public class VehicleTransportSystemApplication {
	//public class SpringBootArtifactDemoApplication  extends SpringBootServletInitializer  {

	public static void main(String[] args) {

	 	ApplicationContext context =SpringApplication.run(VehicleTransportSystemApplication.class, args);




	}


}
