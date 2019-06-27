package Controllers;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.hibernate.Session;

import Models.Jogo;
import Utils.Html;
import Utils.JsonUtils;

@ManagedBean(name="indexController")
@ApplicationScoped
public class IndexController implements Serializable {
	private static final long serialVersionUID = -234087942137454037L;
	private String destaques;
	private String maisVendidos;
	private String maisDestaques;
	public String getMaisVendidos() {
		return maisVendidos;
	}

	public void setMaisVendidos(String maisVendidos) {
		this.maisVendidos = maisVendidos;
	}

	public String getMaisDestaques() {
		return maisDestaques;
	}

	public void setMaisDestaques(String maisDestaques) {
		this.maisDestaques = maisDestaques;
	}

	public String getDestaques() {
		return destaques;
	}

	public void setDestaques(String destaques) {
		this.destaques = destaques;
	}
    public IndexController() {
    	this.destaques = destaques(new int[] {692850, 760060,776490,381210});
    	this.maisVendidos = Html.slickCard(new int[] { 234140, 271590, 578080, 552520, 452410 }, "maisvendidos");
    	this.maisDestaques = Html.slickCard(new int[] { 770240, 752590, 625340, 976310, 381210 }, "maisvendidos");
    }
        
	public String destaques(int[] ids) {
		//Coloquei isso aqui para checar o banco de dados
		Session sessao = null;
		try {
			sessao = Utils.HibernateUtil.getSessionFactory().openSession();
			System.out.println("Conectou!");
		} finally {
			sessao.close();
		}
		String resultado = "<div class=\"destaques\">";
		for(int id:ids) {
			Jogo j = new Jogo();
			try {
				j = JsonUtils.getJogo(id);
				resultado += "		<div class=\"card mb-3\" style=\"  background: #0007 url('" + j.getPlanoFundo() + "') no-repeat right; " + 
						"  background-size: auto 100%;\">\r\n" + 
						"			<div class=\"row no-gutters\">\r\n" + 
						"				<div class=\"col-md-8\">\r\n" + 
						"					<img src=\"" + j.getImagemCabecalho() + "\" class=\"card-img\">\r\n" + 
						"				</div>\r\n" + 
						"				<div class=\"col-md-4\">\r\n" + 
						"					<div class=\"card-body text-white\">\r\n" + 
						"						<h5 class=\"card-title\">" + j.getNome() +"</h5>\r\n" + 
						"						<p>Preço: " + j.getPreco().getFinalFormatado() + "</p>\r\n" + 
						"						<a href='./jogo.xhtml?id="+ j.getSteamAppid() +"' class='btn btn-primary'>Ver Mais</a>"+
						"					</div>\r\n" + 
						"				</div>\r\n" + 
						"			</div>\r\n" + 
						"		</div>";
			} catch (Exception e) {
				resultado += Html.cardError(e);
				e.getStackTrace();
			}
		}
		resultado += "</div>";
		return resultado;
	}
}
