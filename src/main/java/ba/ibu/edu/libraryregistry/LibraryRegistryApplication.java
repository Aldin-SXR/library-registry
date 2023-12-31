package ba.ibu.edu.libraryregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LibraryRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryRegistryApplication.class, args);
	}

}
