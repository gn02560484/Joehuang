package JavaJoe;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class joe61 {

	public static void main(String[] args) {    //送出端
		// TODO Auto-generated method stub
		byte[] buf = "Hello,".getBytes();
		
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(
					buf, buf.length, 
					InetAddress.getByName("192.168.201.105"), 
					8888);
			socket.send(packet);
			
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
