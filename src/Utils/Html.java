package Utils;

import Models.Jogo;

public class Html {
	public static String destaques(int[] ids) {
		String resultado = "<div class=\"destaques\">";
		for(int id:ids) {
			Jogo j = new Jogo();
			try {
				j = JsonUtils.getJogo(id);
				resultado += "	<div class=\"card mb-3\">\r\n" + 
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
				resultado += cardError(e);
				e.getStackTrace();
			}
		}
		resultado += "</div>";
		return resultado;
	}
	public static String slickCard(int[] ids, String nome) {
		String resultado = "<div class='container " + nome + "'>";
		for(int id:ids) {
			Jogo j = new Jogo();
			try {
				j = JsonUtils.getJogo(id);
				resultado += "<div class='card mr-2'>"
						+ "<img class='card-img-top' src='" + j.getImagemCabecalho() + "' alt=''>"
						+ "<div class='card-body'>"
						+ "<h5 class='card-title'>" + j.getNome() + "</h5>"
						+ "<div class='card-text'>Preço:" + j.getPreco().getFinalFormatado() + "</div>"
						+ "<a href='./jogo.xhtml?id="+ j.getSteamAppid() +"' class='btn btn-primary'>Ver Mais</a>"
						+ "</div>"
						+ "</div>";
			} catch (Exception e) {
				resultado += cardError(e);
				e.getStackTrace();
			}
		}
		resultado += "</div>";
		return resultado;
	}
	public static String cardError(Exception e) {
		return "<div class='card mr-2'>"
				+ "<div class='text-center'>"
				+ "<i class='far fa-dizzy card-img-top'></i>"
				+ "</div>"
				+ "<div class='card-body'>"
				+ "<h5 class='card-title'>Ocorreu um erro</h5>"
				+ "<div class='card-text'>" + e.getMessage() + "</div>"
				+ "<a href='./404/index.html' class='btn btn-primary'>Ver Mais</a>"
				+ "</div>"
				+ "</div>";
	}
}
