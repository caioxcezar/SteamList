package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metacritic {
	@JsonProperty("score")
	private int pontuacao;
	@JsonProperty("url")
	private String url;
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
