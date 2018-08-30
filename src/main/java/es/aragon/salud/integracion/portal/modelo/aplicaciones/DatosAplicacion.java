package es.aragon.salud.integracion.portal.modelo.aplicaciones;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class DatosAplicacion implements Serializable {

	private static final long serialVersionUID = -5097761652603987230L;
	
	private String aplicacion;
	private String abreviatura;
	private String descripcion;
	
	public String getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
