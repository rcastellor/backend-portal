package es.aragon.salud.integracion.portal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import es.aragon.salud.integracion.portal.modelo.Contacto;


@CrossOrigin(origins="http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "contactos", path = "contactos")
public interface RepositorioContactos extends PagingAndSortingRepository<Contacto, Integer>{

}
