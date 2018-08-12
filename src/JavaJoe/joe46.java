package JavaJoe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class joe46 {

	public static void main(String[] args) {
		try {                                                              //file 分兩種: 文字檔 ,  binary file(非文字檔)
			FileInputStream Fin = new FileInputStream("dir1/joe.txt");     //inputstream 不適合用來讀文字檔(一次只能讀一個byte ,但中文一個字不只一個byte)
			int temp;
			byte[] b = new byte[2];
			
			do {
			temp = Fin.read(b);
			System.out.print((char)temp);
			}while(temp!=-1);
			
			Fin.close();
		}catch (FileNotFoundException e) {

		}catch (IOException e) {

		}

	}

}
