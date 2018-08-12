package JavaJoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MypanelV3 extends Mypanel{
	public MypanelV3() {
		addMouseListener(new Mymouselistener());
	}
	//
	private class Mymouselistener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			System.out.println("OK");
		}
	}

}
