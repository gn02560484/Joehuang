package JavaJoe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class joe50 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		File source = new File("dir1/view.jpg");
		byte[] buf = new byte[source.length()<2000000000?(int)source.length():2000000000]; //陣列內用int 存 , int最大2G
		
		try {
			FileInputStream fin = new FileInputStream(source);
			FileOutputStream fout = new FileOutputStream("dir3/joe7.jpg");
			int len =0;
			while((len=fin.read(buf)) !=-1  ) {
				fout.write(buf, 0, len);
				
			}
			
			//fin.read(buf);
			fin.close();
			
			//fout.write(buf);
			fout.flush();
			fout.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("OK : " + (System.currentTimeMillis() - start));

	}

}
