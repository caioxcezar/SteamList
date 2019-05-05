package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Categoria {
	@JsonProperty("id")
	private int id;
	@JsonProperty("description")
	private String descricao;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
