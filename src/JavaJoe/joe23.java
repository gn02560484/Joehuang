package JavaJoe;

public class joe23 {

	public static void main(String[] args) {
		String s1 = new String();  //建構式用new 宣告,   //電子交換的資料全部都是字串  //字串物件的字串內容, 原本記憶體位置的字串無法被變更
		byte[] b2 = {97,98,99,100};
		String s2 = new String(b2);
		String s3 = new String(b2,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s1 = new String(b2); //s1被指向新的記憶體位置, 原本的位置不在被使用, 
		String s4 = "joe"; //"joe"字串會被建成一個物件實體, s4被指向"joe"的位置(Sring pool內)
		String s5 = "joe"; //s5會被指向(在String Pool內)和s4同一個字串
		String s6 = new String(s4); // s6會指向一個新的記憶體位置, 記憶體位置內會建置一個給s4用的新的class記憶體空間
		String s7 = new String(s5); // 同上
		
		int a = 10,b = 10;
		System.out.println(a==b);
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s6==s7); //字串物件實體的內容為記憶體位址, 字串的內容為字串  //s6,s7指向的記憶體位置不一樣
		System.out.println("-----------------------------------");
		System.out.println(s4.equals(s5));//equal比對的是字串物件指向的位置的內容
		System.out.println(s4.equals(s6));
		System.out.println(s4.equals(s7));
		System.out.println("-----------------------------------");
		s4 = s6;
		System.out.println(s4==s6);

	}

}
