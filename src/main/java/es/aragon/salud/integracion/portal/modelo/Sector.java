package es.aragon.salud.integracion.portal.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name="sectores")
public class Sector implements Serializable {

	private static final long serialVersionUID = 2547863683274631705L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	
	private String nombre;

	private String codigo;
	private String ipvirtual;
	private Integer nodoActivo;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "sector")
	private List<NodoRhapsody> nodosRhapsody = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "sector")
	private List<NodoBaseDatos> nodosBaseDatos = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "sector")
	private List<NodoServidorAplicaciones> nodosServidorAplicaciones = new ArrayList<>();

	
	@ManyToMany(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinTable(name="contactos_sector",
		joinColumns= {@JoinColumn(name="sector_id", referencedColumnName="id")},
		inverseJoinColumns= {@JoinColumn(name="contacto_id", referencedColumnName="id")})
	private Set<Contacto> contactos = new HashSet<>();
	
	
	
	public List<NodoServidorAplicaciones> getNodosServidorAplicaciones() {
		return nodosServidorAplicaciones;
	}
	public void setNodosServidorAplicaciones(List<NodoServidorAplicaciones> nodosServidorAplicaciones) {
		this.nodosServidorAplicaciones = nodosServidorAplicaciones;
	}
	public List<NodoRhapsody> getNodosRhapsody() {
		return nodosRhapsody;
	}
	public void setNodosRhapsody(List<NodoRhapsody> nodosRhapsody) {
		this.nodosRhapsody = nodosRhapsody;
	}
	public List<NodoBaseDatos> getNodosBaseDatos() {
		return nodosBaseDatos;
	}
	public void setNodosBaseDatos(List<NodoBaseDatos> nodosBaseDatos) {
		this.nodosBaseDatos = nodosBaseDatos;
	}
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
	
	public Set<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
