package JavaJoe;

public class joe25 {

	public static void main(String[] args) {
		Joe251 b1 = new Joe251(2);
		//Joe251 b2 = new Joe251();
		
		Joe251 b3 = new Joe251(2);
		System.out.println(b1.equals(b3));
		System.out.println(b1==b3);
	}

}

class Joe251 {
	private int a;
	Joe251(int a){
		//super(); //系統會隱函叫出父類別的預設建構式,任何建構式會在第一道(只能在第一道)敘述句,將父類別的建構式建構出來
		//如果沒有自行定義父類別的建構式, 會自動呼叫父類別沒有傳參數的建構式
		this.a = a;
		System.out.println("Joe251()");
	}
	
	public int geta() {
		return a;
	}
	
	public boolean equals(Object obj) { //改寫override原本的方法 ,public
		return ((Joe251)obj).geta() ==a;
	}
	
}

class Joe252 extends Joe251{  //如果沒有定義建構式, 會找父類別沒傳參數的建構式,來當作預設的建構式
	Joe252(){
		super(2);
	}
}
class Joe253 extends Joe252{
	
}

