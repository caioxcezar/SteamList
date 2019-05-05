package Controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Models.Jogo;
import Models.Usuario;
import Utils.JsonUtils;

/**
 * Servlet implementation class TesteJson
 */
@WebServlet("/TesteJson")
public class TesteJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TesteJson() {
//        Usuario us = new Usuario();
//        Usuario us2 = new Usuario();
//        us.setNome("Caio");
//        us.setApelido("caioxcezar");
//        us.setEmail("email@email.com");
//        us.setID(1);
//        us.setVisibilidadeNome(true);
//        us.setSenha("UmaSenhaMuitoPoderosa");
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//        	to file
//			mapper.writeValue(new File("D:\\Documents\\usuario.json"), us);
//			to string
//        	String jsonInString = mapper.writeValueAsString(us);
//			System.out.println("Json: " + jsonInString);
//			json to java
//			Usuario user = mapper.readValue(jsonInString, Usuario.class);
//			System.out.println("Nome do user: " + user.getNome());
//		} catch (JsonGenerationException e) {
//			System.out.println("JsonGenerationException: " + e.getMessage());
//		} catch (JsonMappingException e) {
//			System.out.println("JsonMappingException: " + e.getMessage());
//		} catch (IOException e) {
//			System.out.println("IOException: " + e.getMessage());
//		}
    	///Get Json from URL
//    	String js;
//		try {
//			js = JsonUtils.readJsonFromUrl("https://store.steampowered.com/api/appdetails?appids=1074840");
//	    	BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Documents\\jogo.json"));
//	        writer.write(js);
//	        writer.close();
//	        //capturar conteudo para string
//	        byte[] encoded = Files.readAllBytes(Paths.get("D:\\Documents\\jogo.json"));
//	        String x = new String(encoded, Charset.defaultCharset());
//			System.out.println("json: " + x);
//		} catch (IOException e) {
//			System.out.println("erro");
//			e.printStackTrace();
//		}
    	byte[] encoded = {};
		try {
			encoded = Files.readAllBytes(Paths.get("D:\\Documents\\jogo.json"));
			ObjectMapper mapper = new ObjectMapper();
	        String x = new String(encoded, Charset.defaultCharset());
	        x = x.substring(34, (x.length() - 2));
	        x = x.replace("requirements\":[]", "requirements\": { \"minimum\": \"\", \"recommended\": \"\" }");
	        x = x.replace("[]", "null");
	        System.out.println("json: " + x);
	        Jogo jg = mapper.readValue(x, Jogo.class);
	        System.out.println("jogo nome: " + jg.getNome());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Session sessao = null;
//		try {
//			sessao = HibernateUtil.getSessionFactory().openSession();
//			response.getWriter().append("Sucesso ao conectar ao BD");
//		} catch (Exception e) {
//			response.getWriter().append("Erro ao conectar ao BD");
//		} 
//		finally {
//			sessao.close();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
