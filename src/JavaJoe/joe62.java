package JavaJoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class joe62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("before");
			Socket socket = server.accept();       //three-way handshaking
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			
			
			int len;String line;
			while((line = br.readLine()) != null ) {
				System.out.println(line);
			}
			
			server.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
