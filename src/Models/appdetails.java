package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class appdetails {
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
	@JsonProperty("price_overview")
	private Preco preco;
	@JsonProperty("reviews")
	private String reviews;
	@JsonProperty("legal_notice")
	private String notaLegal;
	@JsonProperty("metacritic")
	private Metacritic metacritic;
	@JsonProperty("package_groups")
	private Colecao[] colecoes;
	@JsonProperty("recommendations")
	private Recomendacao recomendacoes;
	@JsonProperty("achievements")
	private Conquistas conquistas;
	@JsonProperty("background")
	private String planoFundo;
//	@JsonIgnore
//	public Object content_descriptors, controller_support, demos, packages, drm_notice, ext_user_account_notice;
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
	public Lancamento getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Lancamento dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public Preco getPreco() {
		return preco;
	}
	public void setPreco(Preco preco) {
		this.preco = preco;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public String getNotaLegal() {
		return notaLegal;
	}
	public void setNotaLegal(String notaLegal) {
		this.notaLegal = notaLegal;
	}
	public Metacritic getMetacritic() {
		return metacritic;
	}
	public void setMetacritic(Metacritic metacritic) {
		this.metacritic = metacritic;
	}
	public Colecao[] getColecoes() {
		return colecoes;
	}
	public void setColecoes(Colecao[] colecoes) {
		this.colecoes = colecoes;
	}
	public Recomendacao getRecomendacoes() {
		return recomendacoes;
	}
	public void setRecomendacoes(Recomendacao recomendacoes) {
		this.recomendacoes = recomendacoes;
	}
	public Conquistas getConquistas() {
		return conquistas;
	}
	public void setConquistas(Conquistas conquistas) {
		this.conquistas = conquistas;
	}
	public String getPlanoFundo() {
		return planoFundo;
	}
	public void setPlanoFundo(String planoFundo) {
		this.planoFundo = planoFundo;
	}
}
