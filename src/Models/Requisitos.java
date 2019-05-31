package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Requisitos {
	@JsonProperty("minimum")
	private String minimo;
	@JsonProperty("recommended")
	private String recomendado;
	public String getMinimo() {
		return minimo;
	}
	public void setMinimo(String minimo) {
		this.minimo = minimo;
	}
	public String getRecomendado() {
		return recomendado;
	}
	public void setRecomendado(String recomendado) {
		this.recomendado = recomendado;
	}
}
