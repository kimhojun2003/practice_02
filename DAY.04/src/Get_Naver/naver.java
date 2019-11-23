package Get_Naver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class naver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		try {
			URL url = new URL("https://www.naver.com");
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