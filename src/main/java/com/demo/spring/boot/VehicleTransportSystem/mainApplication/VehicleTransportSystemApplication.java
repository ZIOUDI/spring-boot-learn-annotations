package com.demo.spring.boot.VehicleTransportSystem.mainApplication;

import com.demo.spring.boot.VehicleTransportSystem.mainApplication.swaggers.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration // Cette annotation marque cette classe comme une classe de configuration Spring.
//@EnableScheduling // Cette annotation active la planification des tâches dans l'application.

//@ComponentScan({"com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository","com.demo.spring.boot.SpringBootArtifactDemo.services"})
//@EnableJpaRepositories(basePackages = "com.demo.spring.boot.SpringBootArtifactDemo.repositories.CityRepository")
//@EnableSwagger2
//@EntityScan(basePackages = { "com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities" })
/*@SpringBootApplication (scanBasePackages = {"com.demo.spring.boot.VehicleTransportSystem.mainApplication.entities",
											"com.demo.spring.boot.VehicleTransportSystem.mainApplication.repositories",
		 									"com.demo.spring.boot.VehicleTransportSystem.mainApplication.services"

})*/

// Cette annotation marque cette classe comme une application Spring Boot et active la configuration automatique de Spring Boot.

@EnableSwagger2
@EnableWebMvc
@Import(SwaggerConfig.class)
@SpringBootApplication
public class VehicleTransportSystemApplication {
	//public class SpringBootArtifactDemoApplication  extends SpringBootServletInitializer  {

	public static void main(String[] args) {

	 	ApplicationContext context =SpringApplication.run(VehicleTransportSystemApplication.class, args);




	}


}
