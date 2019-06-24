package Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vdurmont.emoji.EmojiParser;

import Models.Dlc;
import Models.FullGame;
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

	public static Jogo getJogo(int id) throws IOException {
		ObjectMapper mapper = new ObjectMapper()
				  .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String js = readJsonFromUrl("https://store.steampowered.com/api/appdetails?appids=" + id);
		js = js.substring(js.indexOf("{\"type\":"), (js.length() - 2));
		js = js.replace("requirements\":[]", "requirements\": { \"minimum\": \"\", \"recommended\": \"\" }");
		js = js.replace("[]", "null");
		Jogo jg = mapper.readValue(js, Jogo.class);
		return jg;
	}
	
	public static void jsonToFile(int id) throws IOException {
		String js = JsonUtils.readJsonFromUrl("https://store.steampowered.com/api/appdetails?appids="+id);
		BufferedWriter writer = new BufferedWriter(new FileWriter(id+".json"));
		writer.write(js);
		writer.close();
	}
	
	public static String fileToJson(String path) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, Charset.defaultCharset());
	}
	
	public static Dlc getDlc(int id) throws IOException {
		ObjectMapper mapper = new ObjectMapper()
				  .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		String ds = readJsonFromUrl("https://store.steampowered.com/api/appdetails?appids=" + id);
		ds = ds.substring(ds.indexOf("{\"type\":"), (ds.length() - 2));
		ds = ds.replace("requirements\":[]", "requirements\": { \"minimum\": \"\", \"recommended\": \"\" }");
		ds = ds.replace("[]", "null");
		Dlc dlc = mapper.readValue(ds, Dlc.class);
		return dlc;
	}
	
//	public static void main(String[] args) {
//		ObjectMapper mapper = new ObjectMapper();
//		String js;
//		try {
//			js = fileToJson("C:\\Users\\caioc\\Downloads\\v2.json");
//			js = js.substring(js.indexOf("[{\"appid\""), (js.length() - 2));
//			FullGame[] jgs = mapper.readValue(js, FullGame[].class);
//			for(FullGame jogo : jgs) {
//				jogo.setNome(EmojiParser.parseToAliases(jogo.getNome()));
//				
//				Crud.salvar(jogo);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
}
