package JavaJoe;

import java.io.File;

public class joe48 {

	public static void main(String[] args) {
		File f1 = new File("dir1/joe2.txt");
		File f2 = new File("dir3/joe3.txt");
		if(f1.renameTo(f2)) {   //剪下貼上
			System.out.println("OK");
		}else {
			System.out.println("false");
		}

	}

}
