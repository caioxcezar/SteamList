package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {
	@JsonProperty("id")
	public int id;
	@JsonProperty("name")
	private String nome;
	@JsonProperty("thumbnail")
	private String miniatura;
	@JsonProperty("webm")
	private Webm qualidade;
	@JsonProperty("highlight")
	private boolean highlight;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMiniatura() {
		return miniatura;
	}
	public void setMiniatura(String miniatura) {
		this.miniatura = miniatura;
	}
	public Webm getQualidade() {
		return qualidade;
	}
	public void setQualidade(Webm qualidade) {
		this.qualidade = qualidade;
	}
	public boolean isHighlight() {
		return highlight;
	}
	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}
}