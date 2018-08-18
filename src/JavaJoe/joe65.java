package JavaJoe;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class joe65 {

	public static void main(String[] args) {
		try {
			ServerSocket sever = new ServerSocket(7777);
			Socket socket = sever.accept();
			
			FileOutputStream fout = new FileOutputStream("dir4/view.jpg");
			
			InputStream in = socket.getInputStream();
			int len; 
			byte[] buf = new byte[4096*1024];
			while((len = in.read(buf)) != -1) {
				fout.write(buf,0,len);
			}
			
			fout.flush();
			fout.close();
			in.close();
			sever.close();
			
			System.out.println("Receive OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
