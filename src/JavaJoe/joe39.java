package JavaJoe;

public class joe39 {

	public static void main(String[] args) {
		joe391 obj1 = new joe391();
		joe391.joe392 obj2 = obj1.new joe392();
		obj2.m1();
		joe391.joe393 obj3 = new joe391.joe393();
		obj3.m1();
	}

}

class joe391{
	private int a = 10;
	class joe392{
		void m1() {
			System.out.println("joe391 & joe392 m1() ");
		}
		joe391 m2() {
			System.out.println(a);
			return joe391.this; //回傳外部物件的類別的方法, 常用來設定外部物件
		}
	}
	
	static class joe393{
		void m1() {
			System.out.println("joe391 & joe393 m1() ");
		}
	}
}