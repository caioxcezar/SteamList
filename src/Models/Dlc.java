package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dlc extends appdetails {
	@JsonProperty("fullgame")
	private FullGame jogoCompleto;
}
