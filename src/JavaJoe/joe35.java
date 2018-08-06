package JavaJoe;

public class joe35 {

	public static void main(String[] args) {
		Circle s1 = new Circle();
		Rectabgle s2 = new Rectabgle();
		m2(s1);
		m2(s2);
	}
	
	static void m2(Shape s) { //circle and rectangle 也是屬於 shape的類別
		System.out.println(s.calArea()); //shape 裡面有calarea 但是是由子類別來表現
	}

}

abstract class Shape{  //抽象類別不能直接建構出物件實體
	abstract double callength();
	abstract double calArea();
}

class Circle extends Shape{
	double callength() {
		return 1.0;
	}
	double calArea() {
		return 1.0;
	}
}

class Rectabgle extends Shape{
	double callength() {
		return 4.0;
	}
	double calArea() {
		return 4.0;
	}
}