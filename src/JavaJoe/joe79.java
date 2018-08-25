package JavaJoe;

public class joe79 {

	public static void main(String[] args) {
		joe791 obj1 = new joe791("A");
		joe791 obj2 = new joe791("B");
		obj1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		obj2.start();
		
		System.out.println("OK1");
		try {
			obj2.join();    //插入所在的執行序, 在obj2結束之後, 才會繼續進行原本的執行序
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("OK2");
	}

}

class joe791 extends Thread{

	String name;
	joe791(String name){
		this.name = name;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name + ":" + i);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}