package es.aragon.salud.integracion.portal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import es.aragon.salud.integracion.portal.modelo.Sector;

@RepositoryRestResource(collectionResourceRel = "sectores", path = "sectores")
@CrossOrigin
public interface RepositorioSectores extends PagingAndSortingRepository<Sector, Integer> {
	

}
