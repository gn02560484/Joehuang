package JavaJoe;

public class joe29 {

	public static void main(String[] args) {
		joe291 obj1 = new joe291();
		obj1.m1();
		joe291 obj2 = new joe292();
		obj2.m1(); //宣告為joe291 , 能使用的方法也只有joe291內的方法
		joe292 obj3 = (joe292)obj2;
		obj3.m1();
		obj3.m2();
		System.out.println(obj2==obj3);
		
		if(obj1 instanceof joe292) {
			joe292 obj4 = (joe292)obj1; // =>RuntimeException //編譯成功, 但是無法執行
		}else {
			System.out.println("XX");
		}
		
		
		joe294 obj5 = new joe294();
		//joe292 obj6 = (joe292)obj5; //無法編譯
		
		
	}

}

class joe291{
	void m1() {System.out.println("joe291 :m1()");}
}
class joe292 extends joe291{
	void m1() {System.out.println("joe292 :m1()");}  //override joe291的m1方法
	void m2() {}
}
class joe293 extends joe292{
	void m3() {}
}
class joe294{
	
}