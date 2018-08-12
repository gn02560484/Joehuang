package p2;

public class joe03 extends p1.joe01 {
	int m1() {  //因為p1內的joe01 m1()沒有public 所以這邊部會override
		return 1;
	}
	
	@Override
	protected void m2() { //protect範圍: 相同package 或 繼承的子類別
		// TODO Auto-generated method stub
		super.m2();
	}
}
