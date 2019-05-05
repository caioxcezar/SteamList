package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lancamento {
	@JsonProperty("coming_soon")
	private boolean emBreve;
	@JsonProperty("date")
	private String data;
	
	public boolean isEmBreve() {
		return emBreve;
	}
	public void setEmBreve(boolean emBreve) {
		this.emBreve = emBreve;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
