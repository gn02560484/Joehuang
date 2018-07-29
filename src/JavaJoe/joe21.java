package JavaJoe;

public class joe21 {

	public static void main(String[] args) {
		Bike b1,b2;
		b1 = new Bike();
		b2 = new Bike(1.4);
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		b1.upSpeed(4);
		b1.upSpeed(4);
		b1.upSpeed(4);
		b1.upSpeed(4);
		b1.upSpeed(4);
		b1.upSpeed(4);
		System.out.println(b1.getSpeed());

	}

}
