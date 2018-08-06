package JavaJoe;

public class joe28 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);//sysout 印出的是物件的toString
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		StringBuffer sb2 = sb1.append("123456789012345");
		System.out.println("sb1: "+sb1);//sysout 印出的是物件的toString
		System.out.println("sb1: "+sb1.capacity());
		System.out.println("sb1: "+sb1.length());
		System.out.println("sb2: "+sb2);//sysout 印出的是物件的toString
		System.out.println("sb2: "+sb2.capacity());
		System.out.println("sb2: "+sb2.length());
		
		System.out.println(sb1 == sb2);
		
		sb1.append("6");
		System.out.println("sb1: "+sb1);//sysout 印出的是物件的toString
		System.out.println("sb1: "+sb1.capacity());
		System.out.println("sb1: "+sb1.length());
		
		sb1.append("7");
		System.out.println("sb1: "+sb1);//超出原本的capacity會自動增加capacity
		System.out.println("sb1: "+sb1.capacity());
		System.out.println("sb1: "+sb1.length());
		
		sb1.append("8")
		.replace(0, 3, "joe")
		.append("OK");
		
		joe281 obj1 = new joe281();
		obj1.setS1(12).setS2(24).setS3(45);
		System.out.println(obj1.calsum());
		
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer();
		
		
		System.out.println(sb3.toString());
		System.out.println(sb3.toString().equals(sb4.toString()));
	}

}

class joe281{
	int s1,s2,s3;
	joe281 setS1(int s1) {this.s1 = s1;return this;}
	joe281 setS2(int s2) {this.s2 = s2;return this;}
	joe281 setS3(int s3) {this.s3 = s3;return this;}
	int calsum() {return s1+s2+s3;}
	
}



