package JavaJoe;

public class joe76 {

	public static void main(String[] args) {
		joe761 t1 = new joe761("A");
		joe761 t2 = new joe761("B");
		t1.start();
		t2.start();
		System.out.println("OK");
		
		try {
			Thread.sleep(3*1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("wakeup");
		//t1.start();  //執行續執行一次之後生命週期結束 , 無法再使用執行續
		t1.run(); //還是可以使用物件方法, 但是沒有同步執行
		t2.run();
	}

}

class joe761 extends Thread{
	String name;
	public joe761(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println(name+":" + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
