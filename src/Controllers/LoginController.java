package Controllers;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Models.Usuario;
import Utils.Crud;
import Utils.PasswordUtils;


@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController implements Serializable {
	private static final long serialVersionUID = 9059491921714135982L;
	private String btnLogin = "<input type=\"button\" id=\"login\" class=\"btn btn-outline-success m-2\" value=\"Login\" />";
	private String email = "";
	private String senha = "";
	private boolean logado = false;
	private String mensagem = "";
	private Usuario usr = new Usuario();
	public String sair() throws IOException {
		FacesContext context = FacesContext.getCurrentInstance(); 
        context.getExternalContext().getSessionMap().remove("#{loginController}");
        
        HttpSession session = (HttpSession)FacesContext.getCurrentInstance()
        		.getExternalContext().getSession(true);
        session.invalidate();

    	return "index";
	}
	public void logar() {
		List<Usuario> usrs = new ArrayList<Usuario>();
		try {
			usrs = Crud.listarUsuario(email);
			if(!usrs.equals(null)) {
				if (usrs.size() == 1) {
					usr = usrs.get(0);
					logado = PasswordUtils.verifyUserPassword(senha, usrs.get(0).getSenha(), usrs.get(0).getSalt());
					if(logado == true ) {
						btnLogin = "<input type=\"button\" id=\"login\" class=\"d-none\" value=\"Login\" />";
						btnLogin += "<a class=\"btn btn-outline-success m-2\" href=\"usuario.xhtml\" />" + usr.getApelido() + "</a>";
					} else {
						mensagem = "<div class=\"alert alert-danger p-1 m-0 mt-1\" rule=\"alert\">";
						mensagem += "Senha invalida</div>";
					}
				} else {
					mensagem = "<div class=\"alert alert-danger p-1 m-0 mt-1\" rule=\"alert\">";
					mensagem += "Email invalido</div>";
				}
			}
		} catch (Exception e) {
			mensagem = "<div class=\"alert alert-danger p-1 m-0 mt-1\" rule=\"alert\">";
			mensagem += "Erro ao fazer login</div>";
		}
	}
	public String getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(String btnLogin) {
		this.btnLogin = btnLogin;
	}
	public Usuario getUsr() {
		return usr;
	}
	public void setUsr(Usuario usr) {
		this.usr = usr;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isLogado() {
		return logado;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
}
