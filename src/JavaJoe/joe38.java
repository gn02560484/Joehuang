package JavaJoe;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicButtonListener;

public class joe38 extends JFrame{
	private Mypanel myPanel;
	
	public joe38() {
		setLayout(new BorderLayout());
		
		myPanel = new Mypanel();

		add(myPanel,BorderLayout.CENTER); //要將物件add進來, 才會顯示
//		addWindowListener(new Mylistener());
//		addMouseListener(l);
		
		setSize(480, 480);;
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new joe38();
	}
}

class Mylistener extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("closing");
		System.exit(0); // command line return value, 0 represent normal, non-zero =>error
	}
}
/*
class Mymouselistener extends BasicButtonListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
*/
class joemouselistener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
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

/*
class Mywindowlistener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("closing");
		System.exit(0); // command line return value, 0 represent normal, non-zero =>error
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("closed");

		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("icon");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("deicon");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("active");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("deactive");
		
	}
	
}
*/