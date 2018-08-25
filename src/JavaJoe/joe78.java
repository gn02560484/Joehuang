package JavaJoe;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class joe78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] urls = {
				"https://cdn.pixabay.com/photo/2017/08/30/01/05/milky-way-2695569_960_720.jpg",
				"https://images.alphacoders.com/789/789452.jpg",
		};
		
		String[] targets = {
				"joep01.jpg","joep02.jpg",
		};
		
		for(int i =0;i<urls.length;i++) {
			new FetchURLImage(urls[i], targets[i]).start();
			//new FetchURLImage(urls[i], targets[i]).run();  //非同時進行
		}
	}
	
	
	
}

class FetchURLImage extends Thread{
		private String url,target;

		public FetchURLImage(String url,String target) {
			this.url = url;
			this.target = target;
		}
		
		@Override
		public void run() {
			
			try {
				URL source = new URL(url);
				HttpsURLConnection conn = (HttpsURLConnection)source.openConnection();
				conn.connect();
				BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
				FileOutputStream fout = new FileOutputStream("dir1/" + target);
				byte[] buf = new byte[4096*1024];
				int len = 0;
				while((len = bin.read(buf)) != -1) {
					fout.write(buf,0,len);
				}
				
				fout.flush();
				fout.close();
				bin.close();
				System.out.println("target" + "OK");
				
			} catch (Exception e) {
				System.out.println("error");
			}
		}
	}