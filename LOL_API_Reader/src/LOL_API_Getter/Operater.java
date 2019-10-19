package LOL_API_Getter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Operater {
	
	public static void main(String[] args) {
	
		BufferedReader in = null;
		try {
			String address = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name";
			String user_ID = "/hideonbush";
			String api_key = "?api_key=RGAPI-fb6d5bce-69f5-4dba-adc1-b8428fe571cf";
			URL url = new URL(address + user_ID + api_key);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
		
			con.setRequestMethod("GET");
		
			in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

