package JavaJoe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class joe58 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/joe2.object"));
			Object obj = oin.readObject();

			
		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}
