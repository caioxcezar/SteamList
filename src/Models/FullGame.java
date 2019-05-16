package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FullGame {
	@JsonProperty("appid")
	public int id;
	@JsonProperty("name")
	public String nome;
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
}
