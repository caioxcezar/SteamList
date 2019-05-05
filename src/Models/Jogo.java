package Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Jogo {
	@JsonProperty("type")
	private String tipo;
	@JsonProperty("name")
	private String nome;
	@JsonProperty("steam_appid")
	private int steamAppid;
	@JsonProperty("required_age")
	private int classificacao;
	@JsonProperty("is_free")
	private boolean gratis;
	@JsonProperty("detailed_description")
	private String descricaoDetalhada;
	@JsonProperty("about_the_game")
	private String sobre;
	@JsonProperty("short_description")
	private String descricaoCurta;
	@JsonProperty("supported_languages")
	private String linguasSuportadas;
	@JsonProperty("header_image")
	private String imagemCabecalho;
	@JsonProperty("website")
	private String website;
	@JsonProperty("pc_requirements")
	private Requisitos requisitosWindows;
	@JsonProperty("mac_requirements")
	private Requisitos requisitosMac;
	@JsonProperty("linux_requirements")
	private Requisitos requisitosLinux;
	@JsonProperty("developers")
	private String[] desenvolvedoras;
	@JsonProperty("publishers")
	private String[] distribuidoras;
	@JsonProperty("platforms")
	private Plataformas plataformas;
	@JsonProperty("categories")
	private Categoria[] categorias;
	@JsonProperty("genres")
	private Categoria[] generos;
	@JsonProperty("screenshots")
	private Imagem[] imagens;
	@JsonProperty("movies")
	private Video[] videos;
	@JsonProperty("support_info")
	private Suporte suporte;
	@JsonProperty("release_date")
	private Lancamento dataLancamento;
	@JsonIgnore
	public Object background, content_descriptors, package_groups;

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSteamAppid() {
		return steamAppid;
	}

	public void setSteamAppid(int steamAppid) {
		this.steamAppid = steamAppid;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public boolean isGratis() {
		return gratis;
	}

	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}

	public String getDescricaoDetalhada() {
		return descricaoDetalhada;
	}

	public void setDescricaoDetalhada(String descricaoDetalhada) {
		this.descricaoDetalhada = descricaoDetalhada;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getLinguasSuportadas() {
		return linguasSuportadas;
	}

	public void setLinguasSuportadas(String linguasSuportadas) {
		this.linguasSuportadas = linguasSuportadas;
	}

	public String getImagemCabecalho() {
		return imagemCabecalho;
	}

	public void setImagemCabecalho(String imagemCabecalho) {
		this.imagemCabecalho = imagemCabecalho;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Requisitos getRequisitosWindows() {
		return requisitosWindows;
	}

	public void setRequisitosWindows(Requisitos requisitosWindows) {
		this.requisitosWindows = requisitosWindows;
	}

	public Requisitos getRequisitosMac() {
		return requisitosMac;
	}

	public void setRequisitosMac(Requisitos requisitosMac) {
		this.requisitosMac = requisitosMac;
	}

	public Requisitos getRequisitosLinux() {
		return requisitosLinux;
	}

	public void setRequisitosLinux(Requisitos requisitosLinux) {
		this.requisitosLinux = requisitosLinux;
	}

	public String[] getDesenvolvedoras() {
		return desenvolvedoras;
	}

	public void setDesenvolvedoras(String[] desenvolvedoras) {
		this.desenvolvedoras = desenvolvedoras;
	}

	public String[] getDistribuidoras() {
		return distribuidoras;
	}

	public void setDistribuidoras(String[] distribuidoras) {
		this.distribuidoras = distribuidoras;
	}

	public Plataformas getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(Plataformas plataformas) {
		this.plataformas = plataformas;
	}

	public Categoria[] getCategorias() {
		return categorias;
	}

	public void setCategorias(Categoria[] categorias) {
		this.categorias = categorias;
	}

	public Categoria[] getGeneros() {
		return generos;
	}

	public void setGeneros(Categoria[] generos) {
		this.generos = generos;
	}

	public Imagem[] getImagens() {
		return imagens;
	}

	public void setImagens(Imagem[] imagens) {
		this.imagens = imagens;
	}

	public Video[] getVideos() {
		return videos;
	}

	public void setVideos(Video[] videos) {
		this.videos = videos;
	}

	public Suporte getSuporte() {
		return suporte;
	}

	public void setSuporte(Suporte suporte) {
		this.suporte = suporte;
	}
}
