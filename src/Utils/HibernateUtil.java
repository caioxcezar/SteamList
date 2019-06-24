package Utils;

import java.util.TimeZone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
			return cfg.buildSessionFactory();
		} catch (Throwable e) {
			System.out.println("Criação inicial do objeto SessionFactory falhou. Erro: " + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void main(String[] args) {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Conectou!");
		} finally {
			sessao.close();
		}
	}
}
