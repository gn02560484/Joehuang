package JavaJoe;

import java.io.Serializable;

public class Bike implements Serializable { //任何一個java原始檔中, 只能有一個public的class ,並且class名稱大小寫要和檔名一樣, 沒有public的class只有相同package的可以讀取的到
	protected double speed; //類別的屬性(field)  //private 代表這個屬性, 只有在同一個類別中才能夠存取 (屬性封裝) //public, protect,沒有, private 
	//public : 所有人都可以存取
	//protect : 同一個package 都可以存取
	//private: 只有在同一個類別內可以存取
	
	Bike(){  //建構式在進行物件的初始化, 建構式名稱與類別名稱相同
		speed = 0;
	}
	
	Bike(double speed){   //建構式有overload 差別在參數不同 
		this.speed = speed;
	}
	
	
	void upSpeed() { //類別的方法(method)
		speed = speed==0?1:speed*1.4; 
	}
	
	void upSpeed(int gear) {  //方法有overload 差別在參數不同
		speed = speed==0?1:speed*gear*1.2;
	}
	
	void downSpeed() {
		speed =speed<=0?0:speed-5 ;
		if(speed < 0) {
			speed = 0;
		}
	}
	
	double getSpeed() {
		return speed;
	}
}
