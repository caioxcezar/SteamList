package Controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import Models.FullGame;

@ManagedBean(name="buscaController")
@ViewScoped
public class BuscaController implements Serializable {
	
	private static final long serialVersionUID = 4296560408470714259L;
	@ManagedProperty("#{fullGameController}")
    private FullGameController service;
	private List<FullGame> jogos;
	private String parametro;
	private String mensagem;
	private ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
	
	@PostConstruct
    public void init() {
		HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		parametro = request.getParameter("search");
		if (parametro == null) {
			mensagem = "<div class=\"alert alert-primary m-2\" rule=\"alert\">";
			mensagem += "Por favor insira um termo para a busca</div>";
		}
		try {
			jogos = service.loadGames(parametro);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public FullGameController getService() {
		return service;
	}
	public List<FullGame> getJogos() {
		return jogos;
	}
	public void setJogos(List<FullGame> jogos) {
		this.jogos = jogos;
	}
	public String getParametro() {
		return parametro;
	}
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	public void setService(FullGameController service) {
        this.service = service;
    }
}
