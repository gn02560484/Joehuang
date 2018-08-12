package JavaJoe;

public class joe41 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;

		
		int[] d = new int[3]; 
		
		try {
			c = a/b;
			//System.out.println("before");
			System.out.println(c);
			System.out.println(d[13]);
			//System.out.println("after");
		}catch (ArrayIndexOutOfBoundsException e) {  //try 裡面如果傳回exception  //如果符合catch內的exception--> 執行catch 內的動作,並且程式繼續往下執行
			System.out.println("Oooooooops1");
		}catch (RuntimeException e) {         //先由array catch , 剩下的由runtimeexception catch (runtimeexception範圍較大, 要放在後面catch)
			System.out.println("Oooooops2");
		}
		
		System.out.println("Over");
	}

}
