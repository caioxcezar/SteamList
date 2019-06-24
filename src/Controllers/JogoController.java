package Controllers;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import Models.Categoria;
import Models.FullGame;
import Models.Imagem;
import Models.Usuario;
import Models.appdetails;
import Utils.Crud;
import Utils.JsonUtils;

@ManagedBean(name = "jogoController")
@SessionScoped
public class JogoController implements Serializable {
	private static final long serialVersionUID = -3619137709819326061L;
	private appdetails jogo;
	private String compra;
	private String mensagem;
	@ManagedProperty(value="#{loginController}")
	private LoginController service;
	private ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
	private int appId;

	public appdetails getJogo() {
		return jogo;
	}

	public void setJogo(appdetails jogo) {
		this.jogo = jogo;
	}

	public String getCompra() {
		return compra;
	}

	public void setCompra(String compra) {
		this.compra = compra;
	}

	public ExternalContext getExternalContext() {
		return externalContext;
	}

	public void setExternalContext(ExternalContext externalContext) {
		this.externalContext = externalContext;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LoginController getService() {
		return service;
	}

	public void setService(LoginController service) {
		this.service = service;
	}

	public JogoController() {
		HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		try {
			appId = Integer.parseInt(request.getParameter("id"));
			jogo = JsonUtils.getJogo(appId);
		} catch (Exception e) {
			try {
				externalContext.dispatch("./404/index.html");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void comprar() {
		if (service.isLogado() == false) {
			mensagem = "<div class=\"alert alert-danger m-2\" rule=\"alert\">";
			mensagem += "Por favor faça login ou cadastro</div>";
		} else {
			try {
				Usuario usr = service.getUsr();
				FullGame fg = (FullGame) Crud.buscar(appId, FullGame.class);
				List<FullGame> listaJogos = usr.getJogos().stream().collect(Collectors.toList());
				boolean jaPossui = false;
				for (FullGame fullGame : listaJogos) {
					if (fullGame.getId() == appId) {
						jaPossui = true;
					}
				}
				if (jaPossui == true) {
					mensagem = "<div class=\"alert alert-danger m-2\" rule=\"alert\">";
					mensagem += "Você já possui o game</div>";
				} else {
					listaJogos.add(fg);
					usr.setJogos(listaJogos.stream().collect(Collectors.toSet()));
					Crud.atualizar(usr);
					mensagem = "<div class=\"alert alert-primary m-2\" rule=\"alert\">";
					mensagem += "Adquirido com sucesso</div>";
				}
			} catch (Exception e) {
				mensagem = "<div class=\"alert alert-primary m-2\" rule=\"alert\">";
				mensagem += "Erro ao realizar a compra por favor tente novamente</div>";
			}
		}
	}

	public String getCategorias() {
		String retorno = "";
		for (Categoria categoria : jogo.getCategorias()) {
			retorno += "<div class='card-text'>" + categoria.getDescricao() + "</div>";
		}
		return retorno;
	}

	public String getGeneros() {
		String retorno = "";
		for (Categoria categoria : jogo.getGeneros()) {
			retorno += "<span class='badge badge-primary mr-1'>" + categoria.getDescricao() + "</span>";
		}
		return retorno;
	}

	public String getDistribuidoras() {
		String retorno = "";
		for (String distribuidora : jogo.getDistribuidoras()) {
			retorno += distribuidora + ", ";
		}
		return retorno.substring(0, (retorno.length() - 2));
	}

	public String getDesenvolvedoras() {
		String retorno = "";
		for (String desenvolvedora : jogo.getDesenvolvedoras()) {
			retorno += desenvolvedora + ", ";
		}
		return retorno.substring(0, (retorno.length() - 2));
	}

	public String carousel() {
		String resultado = "<div class=\"carouselJogo\">";
		for (Imagem img : jogo.getImagens()) {
			resultado += "<div>" + "		<div class='jogo-container-bg' style=\"background-image: url('"
					+ img.getImagemCompleta() + "');\">\r\n" + "		</div>" + "		<img src='"
					+ img.getImagemCompleta() + "' class='img-fluid container jogo-container-img'></img>" + "</div>";
		}
		resultado += "</div>";
		return resultado;
	}
}
