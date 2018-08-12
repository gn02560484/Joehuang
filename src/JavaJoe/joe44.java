package JavaJoe;

import java.io.File;

public class joe44 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		File dir1 = new File("./dir1"); // . 代表的是目前的路徑 (相對路徑)   
		//File dir1 = new File("D:/JavaJoe/test1"); //路徑把\換成/    (\是windows在用的 /是其他作業系統)   //跨平台
		System.out.println(dir1.exists());
		System.out.println(dir1.getAbsolutePath());
		
		File[] roots = File.listRoots();
		for(File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
	}

}
