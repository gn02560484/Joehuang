package JavaJoe;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MypanelV2 extends Mypanel {
	public MypanelV2(){
		//super();
		super(100,100);
	}
	private class Mymouselistener implements MouseListener{ //內部類別, 可以直接存取類別的參數方法 //是由外部的物件實體才擁有的類別

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			color = Color.green;
			System.out.println("B");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}



}
