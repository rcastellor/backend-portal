package es.aragon.salud.integracion.portal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import es.aragon.salud.integracion.portal.modelo.aplicaciones.Aplicacion;


@RepositoryRestResource(collectionResourceRel = "aplicaciones", path = "aplicaciones")
@CrossOrigin
public interface RepositorioAplicaciones extends PagingAndSortingRepository<Aplicacion, Integer> {
	

}
