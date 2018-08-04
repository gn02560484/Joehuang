package JavaJoe;

public class joe24 {

	public static void main(String[] args) {
//		Bike b1 = new Bike();
//		Bike s1 = new scooter(); //Bike的類別, 但是方法是用scooter
//		System.out.println(b1.getSpeed());
//		System.out.println(s1.getSpeed());
		Bike b1 = new Bike();
		scooter s1 = new scooter();
		b1.upSpeed();
		s1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		
		s1.changegear(3);
		s1.upSpeed();
		System.out.println(s1.getSpeed());
		
	}

}
