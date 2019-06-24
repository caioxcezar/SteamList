package Controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import Models.FullGame;
import Models.Usuario;

@ManagedBean(name = "usuarioController")
@ViewScoped
public class UsuarioController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7851191889978142457L;
	private Usuario usr = new Usuario();
	private List<FullGame> listaJogos = new ArrayList<FullGame>();
	private String mensagem;
	@ManagedProperty(value="#{loginController}")
	private LoginController service;
	@PostConstruct
	 public void initialize(){
		if(service == null) {
			usr = new Usuario();
		}else {
			if(service.isLogado() == false) {
				mensagem = "<div class=\"alert alert-primary m-2\" rule=\"alert\">";
				mensagem += "Por favor faça login ou cadastro</div>";
			}else {
				try {
					usr = service.getUsr();
					//listaJogos.addAll(usr.getJogos());
					listaJogos = usr.getJogos().stream().collect(Collectors.toList());
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public List<FullGame> getListaJogos() {
		return listaJogos;
	}
	public void setListaJogos(List<FullGame> listaJogos) {
		this.listaJogos = listaJogos;
	}
	public Usuario getUsr() {
		return usr;
	}
	public void setUsr(Usuario usr) {
		this.usr = usr;
	}
	public LoginController getService() {
		return service;
	}
	public void setService(LoginController service) {
		this.service = service;
	}
	
	
}
