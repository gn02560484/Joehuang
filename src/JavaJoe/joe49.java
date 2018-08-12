package JavaJoe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class joe49 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {

			FileInputStream fin = new FileInputStream("dir1/view.jpg");
			FileOutputStream fout = new FileOutputStream("dir3/joe919.jpg");
			int run = 0;
			int temp;
			while((temp=fin.read()) !=-1  ) {
				
				fout.write(temp);
				System.out.println(run);
				run++;
			}
			
			
			fout.flush();
			fout.close();
			fin.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("OK : " + (System.currentTimeMillis() - start));
	}

}
