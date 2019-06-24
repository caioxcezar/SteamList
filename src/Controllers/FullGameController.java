package Controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.vdurmont.emoji.EmojiParser;

import Utils.Crud;
import Models.FullGame;

@ManagedBean(name = "fullGameController")
@ApplicationScoped
public class FullGameController implements Serializable {
	private static final long serialVersionUID = -6059630921107631697L;

	public List<FullGame> loadGames(String parametro) throws Exception {
		List<FullGame> jogos = Crud.listarFullGame(parametro);
		for(int i = 0; i < jogos.size();i++) {
			jogos.get(i).setNome(EmojiParser.parseToUnicode(jogos.get(i).getNome()));
		}
		return jogos;
	}
}
