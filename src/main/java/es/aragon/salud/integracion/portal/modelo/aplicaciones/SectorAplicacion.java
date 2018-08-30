package es.aragon.salud.integracion.portal.modelo.aplicaciones;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SectorAplicacion implements Serializable {

	private static final long serialVersionUID = -3461316535280687788L;
	
	private String sector;
	private Boolean produccion;
	private Boolean pruebas;
	private Boolean desplegado;
	private Boolean previsto;
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public Boolean getProduccion() {
		return produccion;
	}
	public void setProduccion(Boolean produccion) {
		this.produccion = produccion;
	}
	public Boolean getPruebas() {
		return pruebas;
	}
	public void setPruebas(Boolean pruebas) {
		this.pruebas = pruebas;
	}
	public Boolean getDesplegado() {
		return desplegado;
	}
	public void setDesplegado(Boolean desplegado) {
		this.desplegado = desplegado;
	}
	public Boolean getPrevisto() {
		return previsto;
	}
	public void setPrevisto(Boolean previsto) {
		this.previsto = previsto;
	}
	
}
