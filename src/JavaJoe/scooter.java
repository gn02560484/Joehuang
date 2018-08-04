package JavaJoe;

public class scooter extends Bike { //class XXXXX extend 父類別 //繼承父類別  // 父類別只能有一個  //如果沒有指定父類別 , 一律指定為Object
	//屬性以及方法可以被繼承(只要沒有被宣告為private)
	
	private int gear;
	
	void changegear(int gear) { 
		this.gear = gear;
	}
	
	void upSpeed() {  //override Bike的方法, 在基本型別上, 方法名稱一樣,參數一樣, 傳回的值也要和Bike一樣是void
		super.upSpeed();// super用來呼叫父類(Bike)別內的方法
		speed *=gear;
	}
	
	int getgear() {
		return gear;
	}
	
	double getSpeed(){
		return speed; 
	}

}
