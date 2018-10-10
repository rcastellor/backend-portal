package es.aragon.salud.integracion.portal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import es.aragon.salud.integracion.portal.modelo.NodoRhapsody;


@RepositoryRestResource(collectionResourceRel = "nodos", path = "nodos")
@CrossOrigin
public interface RepositorioNodos extends PagingAndSortingRepository<NodoRhapsody, Integer>{

}
