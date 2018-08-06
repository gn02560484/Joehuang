package JavaJoe;

public class joe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface joe371{  //介面無法由介面new出物件實體     但可以藉由類別來製作物件實體
	void m1();
}
interface joe372{
	void m2();
}
interface joe373 extends joe371,joe372{  //interface可以被interface繼承,  也可以多重繼承
	void m3();
}

class joe374 implements joe373{  //interface可以被多重繼承
	public void m1() {}
	public void m2() {}
	public void m3() {}
}