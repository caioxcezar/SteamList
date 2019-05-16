package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Preco {
	@JsonProperty("currency")
	private String moeda;
	private float precoInicial;
	private float precoFinal;
	@JsonProperty("discount_percent")
	private int desconto;
	@JsonProperty("initial_formatted")
	private String inicialFormatado;
	@JsonProperty("final_formatted")
	private String finalFormatado;
	
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public double getPrecoInicial() {
		return precoInicial;
	}
	@JsonSetter("initial")
	public void setPrecoInicial(int precoInicial) {
		this.precoInicial = ((float)precoInicial/100);
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	@JsonSetter("final")
	public void setPrecoFinal(int precoFinal) {
		this.precoFinal = ((float)precoFinal/100);
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public String getInicialFormatado() {
		return inicialFormatado;
	}
	public void setInicialFormatado(String inicialFormatado) {
		this.inicialFormatado = inicialFormatado;
	}
	public String getFinalFormatado() {
		return finalFormatado;
	}
	public void setFinalFormatado(String finalFormatado) {
		this.finalFormatado = finalFormatado;
	}
}
