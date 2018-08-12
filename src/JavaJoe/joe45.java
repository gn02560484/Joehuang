package JavaJoe;

import java.io.File;
import java.io.IOException;

public class joe45 {

	public static void main(String[] args) {
		File f1 = new File("dir1");
		File f2 = new File("dir2");
		File f3 = new File("dir3/dir4/dir5/dir6");
		File f4 = new File("dir3/dir4/dir5/dir6/file1");
		
		if(f1.exists()) {
			System.out.println("f1 exist");
		}
		
		if(f3.exists()) {
			System.out.println("f3 exist");
		}else {
			f3.mkdirs();
		}
		if(!f4.exists()) {
			try {
				f4.createNewFile();
			} catch (IOException e) {
				System.out.println("e.getMessage()");
			}
		}else {System.out.println("f4 exist");}

		if(f1.equals(f2)) {
			System.out.println("f1 = f2");
		}else {
			System.out.println("f1 =/= f2");
		}
		
		File f5 = new File("dir1");
		File f6 = new File("dir2/../dir1");
		File f7 = new File("dir2/../dir1");
		
		
	}

}
