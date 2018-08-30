package es.aragon.salud.integracion.portal.modelo.aplicaciones;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Notificacion implements Serializable {

	private static final long serialVersionUID = 2676997916350461328L;
	
	private String mensaje;
	private String formato;
	private String version;
	private String emisor;
	
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
	public String getEmisor() {
		return emisor;
	}
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
}
