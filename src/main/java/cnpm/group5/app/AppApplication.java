package cnpm.group5.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		System.out.println("App started at: http://localhost:8080");
		System.out.println("Go to http://localhost:8080/init to create roles and admin's account for first time");
	}
}
