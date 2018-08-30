package es.aragon.salud.integracion.portal.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sectores")
public class Sector implements Serializable {

	private static final long serialVersionUID = 2547863683274631705L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(insertable=false, updatable=false, nullable=false)
	private Integer id;
	
	private String nombre;

	private String codigo;
	private String ipvirtual;
	private Integer nodoActivo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="sector_id", nullable=false, referencedColumnName="id", insertable = false, updatable = false)
	private List<Nodo> nodos = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getIpvirtual() {
		return ipvirtual;
	}
	public void setIpvirtual(String ipvirtual) {
		this.ipvirtual = ipvirtual;
	}
	public Integer getNodoActivo() {
		return nodoActivo;
	}
	public void setNodoActivo(Integer nodoActivo) {
		this.nodoActivo = nodoActivo;
	}
	public List<Nodo> getNodos() {
		return nodos;
	}
	public void setNodos(List<Nodo> nodos) {
		this.nodos = nodos;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
