package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Webm {
	@JsonProperty("480")
	public String q480p;
	@JsonProperty("max")
	public String max;

	public String getQ480p() {
		return q480p;
	}

	public void setQ480p(String q480p) {
		this.q480p = q480p;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}
}
