package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Imagem {
	@JsonProperty("id")
	private int id;
	@JsonProperty("path_thumbnail")
	private String miniatura;
	@JsonProperty("path_full")
	private String imagemCompleta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMiniatura() {
		return miniatura;
	}
	public void setMiniatura(String miniatura) {
		this.miniatura = miniatura;
	}
	public String getImagemCompleta() {
		return imagemCompleta;
	}
	public void setImagemCompleta(String imagemCompleta) {
		this.imagemCompleta = imagemCompleta;
	}
}
