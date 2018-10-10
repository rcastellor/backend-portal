package es.aragon.salud.integracion.portal.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Telefono implements Serializable {
	
	private static final long serialVersionUID = 983315394171100948L;
	
	private String telefono;
	private String tipo;
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTelefono() {
		return telefono;
	}
}
