package es.aragon.salud.integracion.portal;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import es.aragon.salud.integracion.portal.modelo.Contacto;
import es.aragon.salud.integracion.portal.modelo.NodoRhapsody;
import es.aragon.salud.integracion.portal.modelo.Sector;

@Component
public class ConfiguracionRest extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(NodoRhapsody.class);
		config.exposeIdsFor(Sector.class);
		config.exposeIdsFor(Contacto.class);
		
	    config.getCorsRegistry().addMapping("/contactos/**")
	      .allowedOrigins("http://localhost:4200")
	      .allowedMethods("GET", "POST", "PUT", "DELETE")
	      .allowCredentials(false).maxAge(3600);
	}
}
