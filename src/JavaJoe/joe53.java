package JavaJoe;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class joe53 {

	public static void main(String[] args) {
		
		try {
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("dir1/joe.dat"));
			dout.writeInt(4);
			dout.writeUTF("joe");
			dout.writeBoolean(false);
			
			dout.flush();
			dout.close();
			System.out.println("save OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
