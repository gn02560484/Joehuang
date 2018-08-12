package JavaJoe;

import java.io.IOException;
import java.text.ParseException;

public class joe43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(100); //會拋出exception的方法得用try catch //runtimeexception 可以不用try catch
		}catch (Exception e) {
			
		}
		

	}

}

class Bird{
	private int leg;
	
	void setLeg(int leg) throws ParseException,IOException{    //宣告setleg 方法內會拋出例外 (throws)有加s 
		if(leg < 0 || leg>2) {
			throw new ParseException("XXX", 3);   //拋出例外
		}else if(leg>2) {
			throw new IOException() ;
		}else {
			this.leg = leg;
		}
		
	}
}

class BirdV2 extends Bird{

	void setLegV2(int leg) throws Exception { //子類別存取修飾字要比父類別大, 拋出的例外要比父類別小
		super.setLeg(leg);
		if(leg > 1000) {
			throw new Exception(); 
		}
		
	}
}


