package JavaJoe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class joe55 {
	
	public static void main(String[] args) {
		Bike b1 = new Bike();
		Student s1 = new Student(90, 60, 24,b1);

		s1.bike.upSpeed();s1.bike.upSpeed();s1.bike.upSpeed();s1.bike.upSpeed();
		System.out.println(s1.bike.getSpeed());

		
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/joe.object")); //要被output的物件必須有執行可序列化的物件
			oout.writeObject(s1);
			oout.writeObject(b1);
			
			oout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("OK");
	}
	
}

class Student implements Serializable{
	int ch,eng,math;
	Bike bike;
	
	public Student(int ch,int eng,int math,Bike bike) {
		this.ch = ch;this.eng = eng;this.math = math;
		this.bike = bike;
	}
	
	int calsum() {
		return ch + eng + math;
	}
	double calAvg() {
		return calsum()/3.0;
	}
	
}