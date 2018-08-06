package JavaJoe;

public class joe30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		joe301 obj2 = new joe301();
		obj2.sayYa("joe","efds","ewqr","jtrtre");
	}

}

class joe301{
	Object m1() {
		return new Object();
	}
	
	int m1(int a) {
		System.out.println("A1");
		return 1;
	}
	
	void m1(int a,int b) {
		System.out.println("A2");
	}
	void m1(int...as) {
		System.out.println("A3");
	}
	
//	void m1(int[] names) { //和上面的布定個數參數重複
//		System.out.println("A4");
//	}
	
	void sayYa(String...names) { //不定個數的參數  ,骨子裡是陣列
		for(String name:names) {
			System.out.println(name + ", Ya");
		}
	}
	
}
class joe302 extends joe301{
	String m1() { //override 的類別必須比父類別的範圍要大  ==> String的功能範圍比Object大
		return "";
	}
	
//	void m1(int[] names) {  //會override joe301內的m1(int...as)
//		System.out.println("A4");
//	}
	
}