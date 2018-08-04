package JavaJoe;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class joe26 extends JFrame{
	private JButton b1,b2;
	public joe26() {
		//System.out.println("joe");
		super("偶的視窗");
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");

		setLayout(new FlowLayout());
		add(b1);add(b2);//添加進入視窗內
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new joe26();

	}

}
