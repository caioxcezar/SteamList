package Controllers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Models.Usuario;
import Utils.Crud;
import Utils.PasswordUtils;

@ManagedBean(name="cadastroController")
@RequestScoped
public class CadastroController implements Serializable {
	private static final long serialVersionUID = -1815897814171602305L;
	private String email;
	private String senha;
	private String nome;
	private String apelido;
	private boolean visibilidadeNome;
	private String mensagem;
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void cadastrar() {
		mensagem = "<div class=\"alert alert-primary m-2\" rule=\"alert\">";
		try {
			Usuario usr = new Usuario();
			usr.setNome(nome);
			usr.setApelido(apelido);
			usr.setEmail(email);
			usr.setSalt(PasswordUtils.getSalt(30));
			usr.setSenha(PasswordUtils.generateSecurePassword(senha, usr.getSalt()));
			usr.setVisibilidadeNome(visibilidadeNome);
			Crud.salvar(usr);
			mensagem += "Cadastro realizado com sucesso" + "</div>";
		} catch (Exception e) {
			mensagem += "Ocorreu um erro ao realizar o cadastro: " + e.getMessage() + "</div>";
		}

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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public boolean isVisibilidadeNome() {
		return visibilidadeNome;
	}
	public void setVisibilidadeNome(boolean visibilidadeNome) {
		this.visibilidadeNome = visibilidadeNome;
	}
}
