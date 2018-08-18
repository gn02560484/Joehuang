package JavaJoe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.net.Socket;

public class joe64 {

	public static void main(String[] args) {
		try {
			File file = new File("dir1/coffee.jpg");
			byte[] buf = new byte[(int)file.length()];
			new FileInputStream(file).read(buf);
			
			
	//		byte[] buf = new byte[4096];
			FileInputStream fin = new FileInputStream("dir1/view.jpg");
			Socket socket = new Socket("192.168.201.161", 7777);
			OutputStream out = socket.getOutputStream();
			
			out.write(buf);
			
			fin.close();
			
			out.flush();
			out.close();
			socket.close();
			System.out.println("send OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
