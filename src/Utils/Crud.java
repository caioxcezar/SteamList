package Utils;

import java.io.IOException;
import java.util.List;

import javax.persistence.criteria.*;

import org.hibernate.*;
import org.hibernate.query.Query;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vdurmont.emoji.EmojiParser;

import Models.*;

public class Crud {
	public static void salvar(Object obj) throws HibernateException {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			sessao.beginTransaction();
			sessao.save(obj);
			sessao.getTransaction().commit();
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de inserão. Mensagem: " + e.getMessage());
			}
		}
	}

	public static void atualizar(Object obj) {
		Session sessao = null;
		Transaction transacao = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.update(obj);
			transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possivel atualizar. Erro:" + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de atualização.Mensagem: " + e.getMessage());
			}
		}
	}

	public static void excluir(Object obj) {
		Session sessao = null;
		Transaction transacao = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.delete(obj);
			transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possivel excluir. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
			}
		}
	}

	public static Object buscar(int valor, Class<?> cs) throws HibernateException {
		Object obj = null;
		Session sessao = null;
		Transaction transacao = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			obj = sessao.get(cs, valor);
			transacao.commit();
			return obj;
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de buscar. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public static List<FullGame> listarFullGame() throws Exception {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<FullGame> cr = cb.createQuery(FullGame.class);
			Root<FullGame> root = cr.from(FullGame.class);
			cr.select(root);
			Query<FullGame> query = session.createQuery(cr);
			return query.getResultList();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de consulta. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public static List<Usuario> listarUsuario() throws Exception {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<Usuario> cr = cb.createQuery(Usuario.class);
			Root<Usuario> root = cr.from(Usuario.class);
			cr.select(root);
			Query<Usuario> query = session.createQuery(cr);
			return query.getResultList();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de consulta. Mensagem: " + e.getMessage());
			}
		}
	}

	public static List<FullGame> listarFullGame(String nome) throws Exception {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<FullGame> cr = cb.createQuery(FullGame.class);
			Root<FullGame> root = cr.from(FullGame.class);
			cr.select(root).where(cb.like(root.get("nome"), "%"+nome+"%"));
			Query<FullGame> query = session.createQuery(cr);
			return query.getResultList();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de consulta. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public static List<Usuario> listarUsuario(String email) throws Exception {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<Usuario> cr = cb.createQuery(Usuario.class);
			Root<Usuario> root = cr.from(Usuario.class);
			cr.select(root).where(cb.equal(root.get("email"), email));
			Query<Usuario> query = session.createQuery(cr);
			return query.getResultList();
		} finally {
			try {
				session.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de consulta. Mensagem: " + e.getMessage());
			}
		}
	}
	
	public void populateFullgame() {
		ObjectMapper mapper = new ObjectMapper()
				  .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			String json = JsonUtils.readJsonFromUrl("https://api.steampowered.com/ISteamApps/GetAppList/v2/");
			json = json.substring(19, json.length() - 2);
			FullGame[] jogos = mapper.readValue(json, FullGame[].class);
			for(FullGame j : jogos) {
				j.setNome(EmojiParser.parseToAliases(j.getNome()));
				Crud.salvar(j);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
