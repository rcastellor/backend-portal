package es.aragon.salud.integracion.portal.modelo.aplicaciones;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Broadcast implements Serializable {
	
	private static final long serialVersionUID = -6759249029578921936L;
	
	private String mensaje;
	private String formato;
	private String version;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
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
}
