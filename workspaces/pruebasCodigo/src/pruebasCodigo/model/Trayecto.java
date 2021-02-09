package pruebasCodigo.model;

import java.util.List;

public class Trayecto {

	private String nombreTrayecto;
	
	private String valorTrayecto;
	
	private List<SubRutas> rutas;

	public String getNombreTrayecto() {
		return nombreTrayecto;
	}

	public void setNombreTrayecto(String nombreTrayecto) {
		this.nombreTrayecto = nombreTrayecto;
	}

	public String getValorTrayecto() {
		return valorTrayecto;
	}

	public void setValorTrayecto(String valorTrayecto) {
		this.valorTrayecto = valorTrayecto;
	}

	public List<SubRutas> getRutas() {
		return rutas;
	}

	public void setRutas(List<SubRutas> rutas) {
		this.rutas = rutas;
	}
	
	
}
