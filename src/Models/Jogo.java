package Models;

import java.net.URI;

public class Jogo {
	private String Tipo;
	private String Nome;
	private String SteamAppid;
	private String Classificacao;
	private boolean Gratis;
	private String DescricaoDetalhada;
	private String Sobre;
	private String DescricaoCurta;
	private String LinguasSuportadas;
	private String ImagemCabecalho;
	private String Website;
	private Requisitos[] RequisitosWindows;
	private Requisitos[] RequisitosMac;
	private Requisitos[] RequisitosLinux;
	private String[] Desenvolvedoras;
	private String[] Distribuidoras;	
	private String PackageGroups;
	private Plataformas[] Plataformas;	
	private Categoria[] Categorias;
	private Categoria[] Generos;
	private Imagem[] Imagens;
	private Video[] DataLancamento;
	private Suporte Suporte;
}
