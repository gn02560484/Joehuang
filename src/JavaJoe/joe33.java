package JavaJoe;

public class joe33 {

	public static void main(String[] args) {
//		joe332.m2();
//		joe331 obj1 = new joe331();
		joe332 obj2 = new joe332();
		joe332 obj3 = new joe332();
	}

}

class joe331{
	{System.out.println("joe331{}");}
	static {System.out.println("joe331{static}");} //一個class的static 區塊, 在一個程式裡面,只有第一次呼叫類別的時候會執行
	
	joe331(){
		System.out.println("joe331()");
	}
	void m1() {System.out.println("joe331(): m1()");}
	static void m2() {System.out.println("joe331(): m2()");}
}

class joe332 extends joe331{
	{System.out.println("joe332{}");}
	static {System.out.println("joe332{static}");} 
	
	joe332(){
		System.out.println("joe332()");
	}
	void m1() {System.out.println("joe332(): m1()");}
	static void m2() {System.out.println("joe332(): m2()");}
}
