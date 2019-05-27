package Controllers;

import javax.faces.bean.ManagedBean;
import Models.Jogo;
import Utils.Html;
import Utils.JsonUtils;

@ManagedBean(name="indexController")
public class IndexController {
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
    	//this.destaques = destaques(new int[] {692850, 760060,776490,381210});
    	this.destaques = destaqueoffline();
    	//this.maisVendidos = Html.slickCard(new int[] { 234140, 271590, 578080, 552520, 452410 }, "maisvendidos");
    	this.maisVendidos = maisVendidoOffline();
    	//this.maisDestaques = Html.slickCard(new int[] { 770240, 752590, 625340, 976310, 381210 }, "maisvendidos");
    	this.maisDestaques = maisDestaquesOffline();
    }
    
    public String maisDestaquesOffline() {
    	return "<div class=\"container maisvendidos\">\r\n" + 
    			"            <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"                    src=\"https://steamcdn-a.akamaihd.net/steam/apps/271590/header.jpg?t=1544815097\" alt=\"\">\r\n" + 
    			"                <div class=\"card-body text-dark\">\r\n" + 
    			"                    <h5 class=\"card-title\">Grand Theft Auto V</h5>\r\n" + 
    			"                    <div class=\"card-text\">Preço:R$ 69,99</div><a href=\"/busca.jsp?appid=271590\" class=\"btn btn-primary\"\r\n" + 
    			"                        tabindex=\"-1\">Comprar</a>\r\n" + 
    			"                </div>\r\n" + 
    			"            </div>\r\n" + 
    			"            <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"                    src=\"https://steamcdn-a.akamaihd.net/steam/apps/578080/header.jpg?t=1556089957\" alt=\"\">\r\n" + 
    			"                <div class=\"card-body text-dark\">\r\n" + 
    			"                    <h5 class=\"card-title\">PLAYERUNKNOWN'S BATTLEGROUNDS</h5>\r\n" + 
    			"                    <div class=\"card-text\">Preço:R$ 55,99</div><a href=\"/busca.jsp?appid=578080\" class=\"btn btn-primary\"\r\n" + 
    			"                        tabindex=\"-1\">Comprar</a>\r\n" + 
    			"                </div>\r\n" + 
    			"            </div>\r\n" + 
    			"            <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"                    src=\"https://steamcdn-a.akamaihd.net/steam/apps/552520/header.jpg?t=1554724751\" alt=\"\">\r\n" + 
    			"                <div class=\"card-body text-dark\">\r\n" + 
    			"                    <h5 class=\"card-title\">Far Cry® 5</h5>\r\n" + 
    			"                    <div class=\"card-text\">Preço:R$ 159,99</div><a href=\"/busca.jsp?appid=552520\"\r\n" + 
    			"                        class=\"btn btn-primary\" tabindex=\"-1\">Comprar</a>\r\n" + 
    			"                </div>\r\n" + 
    			"            </div>\r\n" + 
    			"            <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"                    src=\"https://steamcdn-a.akamaihd.net/steam/apps/452410/header.jpg?t=1555990770\" alt=\"\">\r\n" + 
    			"                <div class=\"card-body text-dark\">\r\n" + 
    			"                    <h5 class=\"card-title\">Damsel</h5>\r\n" + 
    			"                    <div class=\"card-text\">Preço:R$ 37,99</div><a href=\"/busca.jsp?appid=452410\" class=\"btn btn-primary\"\r\n" + 
    			"                        tabindex=\"-1\">Comprar</a>\r\n" + 
    			"                </div>\r\n" + 
    			"            </div>\r\n" + 
    			"            <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"                    src=\"https://steamcdn-a.akamaihd.net/steam/apps/234140/header.jpg?t=1552496093\" alt=\"\">\r\n" + 
    			"                <div class=\"card-body text-dark\">\r\n" + 
    			"                    <h5 class=\"card-title\">Mad Max</h5>\r\n" + 
    			"                    <div class=\"card-text\">Preço:R$ 49,99</div><a href=\"/busca.jsp?appid=234140\" class=\"btn btn-primary\"\r\n" + 
    			"                        tabindex=\"-1\">Comprar</a>\r\n" + 
    			"                </div>\r\n" + 
    			"            </div>\r\n" + 
    			"</div>";
    }
    
    public String maisVendidoOffline() {
    	return "<div class=\"container maisvendidos\">\r\n" + 
    			"    <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"            src=\"https://steamcdn-a.akamaihd.net/steam/apps/752590/header.jpg?t=1558606134\" alt=\"\">\r\n" + 
    			"        <div class=\"card-body text-dark\">\r\n" + 
    			"            <h5 class=\"card-title\">A Plague Tale: Innocence</h5>\r\n" + 
    			"            <div class=\"card-text\">Preço:R$ 119,90</div><a href=\"/busca.jsp?appid=752590\" class=\"btn btn-primary\"\r\n" + 
    			"                tabindex=\"-1\">Comprar</a>\r\n" + 
    			"        </div>\r\n" + 
    			"    </div>\r\n" + 
    			"    <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"            src=\"https://steamcdn-a.akamaihd.net/steam/apps/625340/header.jpg?t=1558734300\" alt=\"\">\r\n" + 
    			"        <div class=\"card-body text-dark\">\r\n" + 
    			"            <h5 class=\"card-title\">XERA: Survival</h5>\r\n" + 
    			"            <div class=\"card-text\">Preço:R$ 37,99</div><a href=\"/busca.jsp?appid=625340\" class=\"btn btn-primary\"\r\n" + 
    			"                tabindex=\"-1\">Comprar</a>\r\n" + 
    			"        </div>\r\n" + 
    			"    </div>\r\n" + 
    			"    <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"            src=\"https://steamcdn-a.akamaihd.net/steam/apps/976310/header.jpg?t=1558735816\" alt=\"\">\r\n" + 
    			"        <div class=\"card-body text-dark\">\r\n" + 
    			"            <h5 class=\"card-title\">Mortal Kombat&nbsp;11</h5>\r\n" + 
    			"            <div class=\"card-text\">Preço:R$ 199,99</div><a href=\"/busca.jsp?appid=976310\" class=\"btn btn-primary\"\r\n" + 
    			"                tabindex=\"-1\">Comprar</a>\r\n" + 
    			"        </div>\r\n" + 
    			"    </div>\r\n" + 
    			"    <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"            src=\"https://steamcdn-a.akamaihd.net/steam/apps/381210/header.jpg?t=1558653315\" alt=\"\">\r\n" + 
    			"        <div class=\"card-body text-dark\">\r\n" + 
    			"            <h5 class=\"card-title\">Dead by Daylight</h5>\r\n" + 
    			"            <div class=\"card-text\">Preço:R$ 18,49</div><a href=\"/busca.jsp?appid=381210\" class=\"btn btn-primary\"\r\n" + 
    			"                tabindex=\"-1\">Comprar</a>\r\n" + 
    			"        </div>\r\n" + 
    			"    </div>\r\n" + 
    			"    <div class=\"card mr-2\"><img class=\"card-img-top\"\r\n" + 
    			"            src=\"https://steamcdn-a.akamaihd.net/steam/apps/770240/header.jpg?t=1535587388\" alt=\"\">\r\n" + 
    			"        <div class=\"card-body text-dark\">\r\n" + 
    			"            <h5 class=\"card-title\">PRO EVOLUTION SOCCER 2019</h5>\r\n" + 
    			"            <div class=\"card-text\">Preço:R$ 119,00</div><a href=\"/busca.jsp?appid=770240\" class=\"btn btn-primary\"\r\n" + 
    			"                tabindex=\"0\">Comprar</a>\r\n" + 
    			"        </div>\r\n" + 
    			"    </div>\r\n" + 
    			"</div>";
    }
    
	public String destaques(int[] ids) {
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
	
	public String destaqueoffline() {
		return "<div class=\"destaques\">\r\n" + 
				"    <div class=\"card mb-3\"\r\n" + 
				"        style=\"background: rgba(0, 0, 0, 0.467) url('https://steamcdn-a.akamaihd.net/steam/apps/776490/page_bg_generated_v6b.jpg?t=1546516526') no-repeat scroll right center / auto 100%; width: 1080px;\"\r\n" + 
				"        >\r\n" + 
				"        <div class=\"row no-gutters\">\r\n" + 
				"            <div class=\"col-md-8\">\r\n" + 
				"                <img src=\"https://steamcdn-a.akamaihd.net/steam/apps/776490/header.jpg?t=1546516526\" class=\"card-img\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"col-md-4\">\r\n" + 
				"                <div class=\"card-body text-white\">\r\n" + 
				"                    <h5 class=\"card-title\">永遠消失的幻想鄉 ～ The Disappearing of Gensokyo</h5>\r\n" + 
				"                    <p>Preço: R$ 17,09</p>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"card mb-3\"\r\n" + 
				"        style=\"background: rgba(0, 0, 0, 0.467) url('https://steamcdn-a.akamaihd.net/steam/apps/381210/page_bg_generated_v6b.jpg?t=1558653315') no-repeat right;background-size: auto 100%;\">\r\n" + 
				"        <div class=\"row no-gutters\">\r\n" + 
				"            <div class=\"col-md-8\">\r\n" + 
				"                <img src=\"https://steamcdn-a.akamaihd.net/steam/apps/381210/header.jpg?t=1558653315\" class=\"card-img\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"col-md-4\">\r\n" + 
				"                <div class=\"card-body text-white\">\r\n" + 
				"                    <h5 class=\"card-title\">Dead by Daylight</h5>\r\n" + 
				"                    <p>Preço: R$ 18,49</p>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"card mb-3\"\r\n" + 
				"        style=\"background: rgba(0, 0, 0, 0.467) url('https://steamcdn-a.akamaihd.net/steam/apps/692850/page_bg_generated_v6b.jpg?t=1558586101') no-repeat right; background-size: auto 100%;\">\r\n" + 
				"        <div class=\"row no-gutters\">\r\n" + 
				"            <div class=\"col-md-8\">\r\n" + 
				"                <img src=\"https://steamcdn-a.akamaihd.net/steam/apps/692850/header.jpg?t=1558586101\" class=\"card-img\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"col-md-4\">\r\n" + 
				"                <div class=\"card-body text-white\">\r\n" + 
				"                    <h5 class=\"card-title\">Bloodstained: Ritual of the Night</h5>\r\n" + 
				"                    <p>Preço: R$ 67,94</p>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"card mb-3\"\r\n" + 
				"        style=\"background: rgba(0, 0, 0, 0.467) url('https://steamcdn-a.akamaihd.net/steam/apps/760060/page_bg_generated_v6b.jpg?t=1558612909') no-repeat right; background-size: auto 100%;\">\r\n" + 
				"        <div class=\"row no-gutters\">\r\n" + 
				"            <div class=\"col-md-8\">\r\n" + 
				"                <img src=\"https://steamcdn-a.akamaihd.net/steam/apps/760060/header.jpg?t=1558612909\" class=\"card-img\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"col-md-4\">\r\n" + 
				"                <div class=\"card-body text-white\">\r\n" + 
				"                    <h5 class=\"card-title\">Mutant Year Zero: Road to Eden</h5>\r\n" + 
				"                    <p>Preço: R$ 53,69</p>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				"</div>";
	}
}
