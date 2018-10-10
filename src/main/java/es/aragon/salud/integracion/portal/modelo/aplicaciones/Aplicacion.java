package es.aragon.salud.integracion.portal.modelo.aplicaciones;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aplicaciones")
public class Aplicacion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false, nullable=false)
	private Integer id;
	
	@Embedded
	private DatosAplicacion datosGenerales;

	@ElementCollection
	private List<SectorAplicacion> sectores = new ArrayList<>();
	
	@ElementCollection
	private List<Notificacion> notificaciones = new ArrayList<>();
	
	@ElementCollection
	private List<Broadcast> broadcast = new ArrayList<>();
	
	@ElementCollection
	private List<Servicio> serviciosConsumidos = new ArrayList<>();
	
	@ElementCollection
	private List<Servicio> serviciosPublicados = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DatosAplicacion getDatosGenerales() {
		return datosGenerales;
	}

	public void setDatosGenerales(DatosAplicacion datosGenerales) {
		this.datosGenerales = datosGenerales;
	}

	public List<SectorAplicacion> getSectores() {
		return sectores;
	}

	public void setSectores(List<SectorAplicacion> sectores) {
		this.sectores = sectores;
	}

	public List<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}

	public List<Broadcast> getBroadcast() {
		return broadcast;
	}

	public void setBroadcast(List<Broadcast> broadcast) {
		this.broadcast = broadcast;
	}

	public List<Servicio> getServiciosConsumidos() {
		return serviciosConsumidos;
	}

	public void setServiciosConsumidos(List<Servicio> serviciosConsumidos) {
		this.serviciosConsumidos = serviciosConsumidos;
	}

	public List<Servicio> getServiciosPublicados() {
		return serviciosPublicados;
	}

	public void setServiciosPublicados(List<Servicio> serviciosPublicados) {
		this.serviciosPublicados = serviciosPublicados;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
