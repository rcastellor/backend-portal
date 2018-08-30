package es.aragon.salud.integracion.portal.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="nodos")
public class Nodo implements Serializable {

	private static final long serialVersionUID = 5814165269925113817L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(insertable=false, updatable=false, nullable=false)
	private Integer id;
	
	@OneToOne
	private Sector sector;
	
	private String nombre;
	private String host;
	private String variableGlobal;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getVariableGlobal() {
		return variableGlobal;
	}
	public void setVariableGlobal(String variableGlobal) {
		this.variableGlobal = variableGlobal;
	}
	
}
