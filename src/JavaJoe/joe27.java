package JavaJoe;

public class joe27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "joe";
		System.out.println(str1);
		joe271 obj1 = new joe271();
		System.out.println(obj1);
		joe271 obj2 = new joe271();
		System.out.println(obj2);
		System.out.println(obj1 ==obj2);
		System.out.println(obj1.equals(obj2));

	}

}

class joe271{
	@Override
	public String toString() {  //物件印出的是toString
		// TODO Auto-generated method stub
		return "joe";
	}
}