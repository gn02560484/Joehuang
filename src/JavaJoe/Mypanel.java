package JavaJoe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Mypanel extends JPanel implements MouseListener{
	private int x,y;
	Color color;
	
	public Mypanel(int x,int y) {
		this.x = x;
		this.y = y;
		color = Color.RED;
		addMouseListener(this);
	}
	
	public Mypanel() {
		System.out.println("Mypanel()");
		color = Color.RED;
		addMouseListener(this);
//		addMouseListener(new MymouseListener());
	}
	/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	class MymouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			repaint();
			System.out.println("X : " + getMousePosition().getX() + "  Y : " +getMousePosition().getY());
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
*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paint");
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(color);
		g2d.fillOval(this.x - 20,this.y -20 , 40, 40);
	}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	this.x = (int)getMousePosition().getX();
	this.y = (int)getMousePosition().getY();
	repaint();
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

