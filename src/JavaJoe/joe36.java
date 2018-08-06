package JavaJoe;

public class joe36 {

	public static void main(String[] args) {
		joe363 obj1 = new joe363();
		joe362 obj2 = new joe363();

	}

}
interface joe362{  //一種規格的觀念  //interface為public
	void m1();
	void m2();
}
class joe363 implements joe362{
	public void m1() {}  //必須宣告為public
	public void m2() {}
	void m3() {}
}
class joe364 implements joe362{
	public void m1() {}
	public void m2() {}
	
}