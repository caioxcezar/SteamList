package Models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String apelido;
	@Column(name = "visibilidade_nome", nullable = false)
	private boolean visibilidadeNome;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String senha;
	@Column(nullable = false)
	private String salt;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuarios_jogos",
		joinColumns = @JoinColumn(name = "jogo_usuario_id"),
		inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private Set<FullGame> jogos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSalt() {
		return salt;
	}
	public Set<FullGame> getJogos() {
		return jogos;
	}
	public void setJogos(Set<FullGame> jogos) {
		this.jogos = jogos;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
}
