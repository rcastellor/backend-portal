package es.aragon.salud.integracion.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("es.aragon.salud.integracion.portal.modelo")
public class Application {
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
}
