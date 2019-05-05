package Models;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Imagem {
	@JsonProperty("id")
	private int id;
	@JsonProperty("path_thumbnail")
	private URI miniatura;
	@JsonProperty("path_full")
	private URI imagemCompleta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public URI getMiniatura() {
		return miniatura;
	}
	public void setMiniatura(URI miniatura) {
		this.miniatura = miniatura;
	}
	public URI getImagemCompleta() {
		return imagemCompleta;
	}
	public void setImagemCompleta(URI imagemCompleta) {
		this.imagemCompleta = imagemCompleta;
	}
}
