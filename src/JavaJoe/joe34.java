package JavaJoe;

public class joe34 {

	public static void main(String[] args) {
		joe341 obj1 = new joe342();//抽象類別不能直接建構出物件實體
		joe341 obj2 = new joe343();
		obj1.m2();
		obj2.m2();
	}

}
abstract class joe341{ //抽象類別不能直接建構出物件實體
	void m1() {
		System.out.println("joe341: m1()");
	}
	abstract void m2();//abstract 強迫子類別要有m2方法 //強迫多型
}
class joe342 extends joe341{
	void m2() {
		System.out.println("joe342: m2()");
	}
}
class joe343 extends joe341{
	void m2() {
		System.out.println("joe343: m2()");
	}
}
