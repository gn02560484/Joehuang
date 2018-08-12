package JavaJoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MypanelV4 extends Mypanel{
	private int a = 10;
	private int b = 20;
	private int c = 30;
	//精簡作法, 布建一個類別, 直接新增一個類別變數
 	private MouseListener Mymouse = new MouseListener() {
		@Override
		public void mouseReleased(MouseEvent e) {
		}		
		@Override
		public void mousePressed(MouseEvent e) {

		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println(a);
		}
	};
	
	private MouseListener Mymouse2 = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			System.out.println(b);
		}
	};
	
	
	public MypanelV4() {
		//super();
		addMouseListener(Mymouse);
		addMouseListener(Mymouse2);
	}
	
	int getC() {
		return this.c;
	}

}

class MouselistenerV100 extends MouseAdapter{
	private MypanelV4 obj;
	
	public MouselistenerV100(MypanelV4 obj) {
		this.obj = obj;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		System.out.println(obj.getC());
	}

	
}
