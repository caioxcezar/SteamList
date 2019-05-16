package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Conquistas {
	@JsonProperty("total")
	private int total;
	@JsonProperty("highlighted")
	private Conquista[] conquista;
}