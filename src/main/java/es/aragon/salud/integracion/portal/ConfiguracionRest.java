package es.aragon.salud.integracion.portal;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import es.aragon.salud.integracion.portal.modelo.Nodo;
import es.aragon.salud.integracion.portal.modelo.Sector;

@Component
public class ConfiguracionRest extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Nodo.class);
		config.exposeIdsFor(Sector.class);
	}

}
