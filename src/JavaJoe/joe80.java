package JavaJoe;

public class joe80 {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Bank bank = new Bank(atm);
		Person pA = new Person(atm, "A");
		Person pB = new Person(atm, "B");
		Person pC = new Person(atm, "C");
		Person pD = new Person(atm, "D");
		
		bank.start();
		pA.start();pB.start();pC.start();pD.start();
	}

}
class ATM{
	private int limit = 1000;
	private int money = 0;
	void add(int add) {
		if((money + add) >1000) {
			//xx
			System.out.println("add: XX");
		}else {
			this.money += add;
			System.out.println("add: " + add + "=>" + money);
		}
	}
	
	synchronized void get(int get,String name) {  //synchronized  同時只能有一個執行序執行這個方法
		if(money < get) {
			
		}else {
			this.money -= get;
			System.out.println(name + ":get:" + get+"=>" + money);
		}
	}
}

class Bank extends Thread {
	private ATM atm;
	
	public Bank(ATM atm) {
		this.atm=atm;
	}
	
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			atm.add(500);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Person extends Thread{
	private ATM atm;
	private String name;
	
	public Person(ATM atm,String name) {
		this.atm = atm;
		this.name = name;
	}
	
	public void run() {
		for(int i =0; i<10; i++) {
			atm.get(((int)(Math.random()*100)+1),this.name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			
		}
	}
	
	
}
