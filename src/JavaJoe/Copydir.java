package JavaJoe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copydir {
	
	public  Copydir(File File ,String DestinationPath) {
		File[] childFile = File.listFiles();
		for(File f1:childFile) {
			if(f1.isFile()) {
				copyfile(f1, DestinationPath+"/"+f1.getName());
			}else if(f1.isDirectory()) {
				File f2 = new File(DestinationPath+"/"+f1.getName());
				f2.mkdirs();
				Copydir copy1 = new Copydir(f1, DestinationPath+"/"+f1.getName()); 
			}
		}
	}
	
	
	
	static void copyfile(File file , String DestinationPath) {
		File source = file;
		byte[] buf = new byte[source.length()<2000000000?(int)source.length():2000000000]; //陣列內用int 存 , int最大2G
		
		try {
			FileInputStream fin = new FileInputStream(source);
			FileOutputStream fout = new FileOutputStream(DestinationPath);
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
		
	}
}
