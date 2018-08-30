package es.aragon.salud.integracion.portal.modelo.aplicaciones;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Servicio implements Serializable {

	private static final long serialVersionUID = 4465177496058887986L;
	
	private String servicio;
	private String peticion;
	private String respuesta;
	private String formato;
	private String version;
	private String aplicacion;
	private String descripcion;
	
	public String getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public String getPeticion() {
		return peticion;
	}
	public void setPeticion(String peticion) {
		this.peticion = peticion;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
