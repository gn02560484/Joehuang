package JavaJoe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class joe52 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/book2.csv");
			InputStreamReader isr = new InputStreamReader(fin, "big5");
			BufferedReader reader = new BufferedReader(isr);
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				String name = data[0];
				String tel = data[1];
				String addr = data[2];
				
				System.out.println("name : " + name);
				System.out.println("TEL : " + tel);
				System.out.println("Address : " + addr);
			}
			fin.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
