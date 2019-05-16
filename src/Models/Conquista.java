package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Conquista {
	@JsonProperty("name")
	private String nome;
	@JsonProperty("path")
	private String imagem;
}

