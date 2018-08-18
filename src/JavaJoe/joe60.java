package JavaJoe;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class joe60 {

	public static void main(String[] args) {   //接收端
		byte[] buf = new byte[1024];
		
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			
			
			
			
			byte[] data = packet.getData();
			int len = packet.getLength();
			InetAddress ip = packet.getAddress();
			
			String masg = new String(data,0,len);
			System.out.println(ip.getHostAddress() + ":"+ len + ":" + masg);
			
			
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		
	}

}
