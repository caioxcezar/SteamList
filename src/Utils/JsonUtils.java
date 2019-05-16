package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import com.fasterxml.jackson.databind.ObjectMapper;

import Models.Dlc;
import Models.Jogo;

public class JsonUtils {
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	  public static String readJsonFromUrl(String url) throws IOException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      return jsonText;
	    } finally {
	      is.close();
	    }
	  }
	  
	  public static Jogo getJogo(int id) {
		  try {
			  ObjectMapper mapper = new ObjectMapper();
			  String js = readJsonFromUrl("https://store.steampowered.com/api/appdetails?appids="+id);
			  js = js.substring(js.indexOf("{\"type\":"), (js.length() - 2));
			  js = js.replace("requirements\":[]", "requirements\": { \"minimum\": \"\", \"recommended\": \"\" }");
			  js = js.replace("[]", "null");
			  Jogo jg = mapper.readValue(js, Jogo.class);
			  return jg;
		  } catch (Exception e) {
			  return null;
		}
	  }
	  public static Dlc getDlc(int id) {
		  try {
			  ObjectMapper mapper = new ObjectMapper();
			  String ds = readJsonFromUrl("https://store.steampowered.com/api/appdetails?appids="+id);
			  ds = ds.substring(ds.indexOf("{\"type\":"), (ds.length() - 2));
			  ds = ds.replace("requirements\":[]", "requirements\": { \"minimum\": \"\", \"recommended\": \"\" }");
			  ds = ds.replace("[]", "null");
			  Dlc dlc = mapper.readValue(ds, Dlc.class);
			  return dlc;
		  } catch (Exception e) {
			  return null;
		}
	  }
}
