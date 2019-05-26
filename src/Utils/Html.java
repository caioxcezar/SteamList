package Utils;

import Models.Jogo;

public class Html {
	public static String slickCarousel(int[] ids, String nome) {
		String resultado = "<div class='container " + nome + "'>";
		for(int id:ids) {
			Jogo j = new Jogo();
			try {
				j = JsonUtils.getJogo(id);
				resultado += "<div class='card mr-2'>" + 
						"<img class='card-img-top' src='" + j.getImagemCabecalho() + "' alt=''>"
						+ "<div class='card-body text-dark'>"
						+ "<h5 class='card-title'>" + j.getNome() + "</h5>"
						+ "<p class='card-text'>Preço:" + j.getPreco().getFinalFormatado() + "</p>"
						+ "<a href='/busca.jsp?appid=" + id + "' class='btn btn-primary'>Comprar</a>"
						+ "</div>"
						+ "</div>";
			} catch (Exception e) {
				resultado += "<div class='card mr-2'>"
						+ "<div class='card-img-top text-center'>"
						+ "<i class='far fa-dizzy text-dark'></i>"
						+ "</div>"
						+ "<div class='card-body text-dark'>"
						+ "<h5 class='card-title'>Ocorreu um erro</h5>"
						+ "<p class='card-text'>" + e.getMessage() + "</p>"
						+ "<a href='/404/index.html' class='btn btn-primary'>Comprar</a>"
						+ "</div>"
						+ "</div>";
				e.getStackTrace();
			}
		}
		resultado += "</div>";
		return resultado;
	}
}
