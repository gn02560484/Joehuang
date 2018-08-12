package JavaJoe;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class joe59 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.microsoft.com");
			for(InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
