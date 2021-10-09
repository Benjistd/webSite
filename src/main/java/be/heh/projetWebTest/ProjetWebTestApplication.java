package be.heh.projetWebTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetWebTestApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProjetWebTestApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "le Monde") String name) {
		return String.format("Hello %s!", name);
	}

}
