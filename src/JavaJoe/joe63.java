package JavaJoe;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class joe63 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.201.161", 9999);
			
			OutputStream out = socket.getOutputStream();
			out.write("Hello!嗨嗨嗨\n你好\n".getBytes());
			out.flush();
			out.close();
			
			
			socket.close();
			System.out.println("OK1");
		} catch (UnknownHostException e) {
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
