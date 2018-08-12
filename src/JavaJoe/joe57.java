package JavaJoe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class joe57 {
	
	public static void main(String[] args) {
		joe573 obj = new joe573();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/joe2.object")); //要被output的物件必須有執行可序列化的物件
			oout.writeObject(obj);
			
			oout.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("OK");
	}
	
}

class joe571{
	joe571(){
		System.out.println("joe571()");
	}
}

class joe572 extends joe571 implements Serializable{
	joe572(){
		System.out.println("joe572()");
	}
}

class joe573 extends joe572{   //父類別joe572序列化, 子類別joe573也會一起序列化 ,但是joe571沒有序列化  沒有序列化的項目在姐序列化的時候會重新建構式
	joe573(){
		System.out.println("joe573()");
	}
}