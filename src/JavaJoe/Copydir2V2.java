package JavaJoe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copydir2V2 {
	
	public Copydir2V2() {
		// TODO Auto-generated constructor stub
	}
	
	static void CopyV2(File File ,String DestinationPath) {
		File[] childFile = File.listFiles();
		for(File f1:childFile) {
			if(f1.isFile()) {
				System.out.println("file found");
				copyfile(f1, DestinationPath+"/"+f1.getName());
			}else if(f1.isDirectory()) {
				System.out.println("directory found");
				File f2 = new File(DestinationPath+"/"+f1.getName());
				f2.mkdirs();
				CopyV2(f1, DestinationPath+"/"+f1.getName()); 
			}
		}
	}
	
	
	
	static void copyfile(File file , String DestinationPath) {
		File source = file;
		byte[] buf = new byte[source.length()<2000000000?(int)source.length():2000000000]; //陣列內用int 存 , int最大2G
		
		try {
			System.out.println("check");
			FileInputStream fin = new FileInputStream(source);
			FileOutputStream fout = new FileOutputStream(DestinationPath);
			int len;
			System.out.println("check2");
			while((len=fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
				System.out.println("check3 :" + len);
				if(len==0) {
					break;
				}
			}
			System.out.println("check4");
			
			//fin.read(buf);
			fin.close();
			
			//fout.write(buf);
			fout.flush();
			fout.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
