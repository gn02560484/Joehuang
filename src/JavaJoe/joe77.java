package JavaJoe;

import java.util.TimerTask;

public class joe77 {

	public static void main(String[] args) {
		joe771 obj1 = new joe771();
		Object obj2 = new joe772();
		joe773 obj3 = new joe773();
		
		obj1.start();
		
		Thread t2 = new Thread((joe772)obj2);  //obj2 執行runable 介面 , 可由thread 建構式,建構一個執行序
		
		t2.start();
		Thread t3 = new Thread(obj3);   
		t3.start();
		
		Thread t4 = new Thread((joe772)obj2) {
			public void run() {                   
				System.out.println("t4!");
			};
		};
		t4.start();
		
		new Thread() {
			public void run() {
				for(int i =10000;i<10020;i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println(e);
						}
					}
			};
		}.start();
		
		
		System.out.println("OK");
	}

}
class joe771 extends Thread{
	@Override
	public void run() {
		
	}
}

class joe772 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =100;i<120;i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}

class joe773 extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1000;i<1020;i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}