package JavaJoe;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class joe54 {

	public static void main(String[] args) {
		try {
			DataInputStream din = new DataInputStream(new FileInputStream("dir1/joe.dat"));
			
			int stage = din.readInt();//讀取資料型態順序必須和檔案順序一樣    //不常用
			String username = din.readUTF();
			boolean issound = din.readBoolean();
			System.out.println("stage :" + stage);
			System.out.println("username :" + username);
			System.out.println("sound :" + issound);
			
			din.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
