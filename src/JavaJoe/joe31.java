package JavaJoe;

public class joe31 {

	public static void main(String[] args) {
		joe311 obj1 = new joe311();
		byte a = 1, b = 2;
		obj1.m1(a,b);

	}

}

class joe311{
	void m1(byte a) {
		System.out.println("A");
	}
	void m1(byte a,int b) {
		System.out.println("B");
	}
	void m1(int a, byte b) {
		System.out.println("C");
	}
	void m1(byte a, byte b) {
		System.out.println("D");
	}
}