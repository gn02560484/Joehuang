package JavaJoe;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class joe66 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.bradchao.com/");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			conn.connect();
			//InputStream in = conn.getInputStream();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream()));
			
			String line;
			while((line = reader.readLine()) != null ) {
				System.out.println(line);
			}
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
