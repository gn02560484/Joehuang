package JavaJoe;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class joe51 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/joe.txt");
			int v = reader.read();
			System.out.println((char)v);
			v = reader.read();
			System.out.println((char)v);
			
			reader.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
