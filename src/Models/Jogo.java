package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jogo extends appdetails {
	@JsonProperty("dlc")
	private int[] dlc;

	public int[] getDlc() {
		return dlc;
	}

	public void setDlc(int[] dlc) {
		this.dlc = dlc;
	}
}
