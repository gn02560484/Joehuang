package JavaJoe;

public class joe20 {

	public static void main(String[] args) {
		Bike b1 = new Bike(); //new 用來宣告物件, 用new宣告出來的物件已經被賦予位址, 物件的值為記憶體位址
		Bike b2 = new Bike();
		System.out.println(b1.getSpeed());
		
//		b1.upSpeed();
//		b1.upSpeed();
		
		do {
			b1.upSpeed();
		}while(b1.getSpeed()<10);
		System.out.println(b1.getSpeed());
	}

}
