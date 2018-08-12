package JavaJoe;

public class joe42 {

	public static void main(String[] args) {
		m1();
	}
	
	static void m1() {
		int a =10, b = 0;
		
		try {
			System.out.println(a/b);
		}catch (Exception e) {
			System.out.println("OK1");
			return;
		}finally {
			System.out.println("OK2"); //不管有沒有拋出例外, finally都會執行
		}
		
		System.out.println("OK3");
	}

}
