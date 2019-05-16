package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Colecao {
	@JsonProperty("name")
	private String nome;
	@JsonProperty("title")
	private String titulo;
	@JsonProperty("description")
	private String descricao;
	@JsonProperty("selection_text")
	private String textoSelecao;
	@JsonProperty("save_text")
	private String textoSave;
	@JsonProperty("display_type")
	private int tipoDisplay;
	@JsonProperty("is_recurring_subscription")
	private boolean subscricaoRecorrente;
	@JsonProperty("subs")
	private Pacote[] pacotes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTextoSelecao() {
		return textoSelecao;
	}
	public void setTextoSelecao(String textoSelecao) {
		this.textoSelecao = textoSelecao;
	}
	public String getTextoSave() {
		return textoSave;
	}
	public void setTextoSave(String textoSave) {
		this.textoSave = textoSave;
	}
	public int getTipoDisplay() {
		return tipoDisplay;
	}
	public void setTipoDisplay(int tipoDisplay) {
		this.tipoDisplay = tipoDisplay;
	}
	public boolean isSubscricaoRecorrente() {
		return subscricaoRecorrente;
	}
	public void setSubscricaoRecorrente(boolean subscricaoRecorrente) {
		this.subscricaoRecorrente = subscricaoRecorrente;
	}
}
