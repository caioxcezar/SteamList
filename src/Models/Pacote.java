package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pacote {
	@JsonProperty("packageid")
	private int id;
	@JsonProperty("percent_savings_text")
	private String descontoTexto;
	@JsonProperty("percent_savings")
	private int desconto;
	@JsonProperty("option_text")
	private String titulo;
	@JsonProperty("option_description")
	private String descricaoOpcao;
	@JsonProperty("can_get_free_license")
	private String licencasGratis;
	@JsonProperty("is_free_license")
	private boolean gratis;
	@JsonProperty("price_in_cents_with_discount")
	private int precoEmCentavosComDesconto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescontoTexto() {
		return descontoTexto;
	}
	public void setDescontoTexto(String descontoTexto) {
		this.descontoTexto = descontoTexto;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricaoOpcao() {
		return descricaoOpcao;
	}
	public void setDescricaoOpcao(String descricaoOpcao) {
		this.descricaoOpcao = descricaoOpcao;
	}
	public String getLicencasGratis() {
		return licencasGratis;
	}
	public void setLicencasGratis(String licencasGratis) {
		this.licencasGratis = licencasGratis;
	}
	public boolean isGratis() {
		return gratis;
	}
	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}
	public int getPrecoEmCentavosComDesconto() {
		return precoEmCentavosComDesconto;
	}
	public void setPrecoEmCentavosComDesconto(int precoEmCentavosComDesconto) {
		this.precoEmCentavosComDesconto = precoEmCentavosComDesconto;
	}
}
