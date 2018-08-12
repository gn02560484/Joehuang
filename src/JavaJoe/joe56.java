package JavaJoe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class joe56 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/joe.object"));
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			Bike b1 = (Bike)oin.readObject();
			System.out.println(s1.calsum() + " : "+s1.calAvg());
			System.out.println("bike speed : "+ b1.getSpeed());
			
			oin.close();
			
		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}
