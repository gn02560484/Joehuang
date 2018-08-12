package JavaJoe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class joe47 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir1/joe2.txt",true);//要件新黨,要確認寫入的目錄有沒有寫入權限  
			fout.write("Hello,World\n".getBytes());  //每次寫入都會先清空   \\檔案存在的話,要看檔案是否有寫入權限
			fout.write("1232414\n".getBytes());
			fout.write("Hello,World\n".getBytes());
			fout.write("Hello,World\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
