package JavaJoe;

public class joe32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class joe321{
	void m1() {
		System.out.println("joe321 m1()");
	}
}

class joe322 extends joe321{
	void m1() { //override 是用來延伸用法
		super.m1();
		System.out.println("joe322 m1()");
	}
}