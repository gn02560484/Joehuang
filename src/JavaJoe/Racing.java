package JavaJoe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import JClock.DigitalClock;

public class Racing extends JFrame{
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	private Horse[] horses = new Horse[8];
	private int rank = 1;
	private DigitalClock clock = new DigitalClock();
	
	public Racing() {
		super();
		setLayout(new GridLayout(9, 0));
		
		JPanel top = new JPanel(new BorderLayout());
		go = new JButton("GO");
		top.add(go, BorderLayout.CENTER);
		top.add(clock, BorderLayout.EAST);
		clock.setSize(200, 200);
		
		add(top);
		for(int i =0; i<lanes.length;i++){
			lanes[i] = new JLabel((i+1) + ".");
			add(lanes[i]);
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				newRound();
			}
		});
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private void newRound() {
		for(int i =0; i<horses.length;i++ ) {
			lanes[i].setText((i+1)+".");
			horses[i] = new Horse(i);
			horses[i].start();
		}
	}
	
	private void stopgame() {
		for(int i =0; i<horses.length;i++ ) {
			horses[i].interrupt(); //中斷 -->造成excpetion  , 在執行序會跳到例外中執行break
		}
	}
	
	private class Horse extends Thread{
		int lane;
		public Horse(int lane) {
			this.lane = lane;
		}
		public void run() {
			for(int i=0; i<100;i++) {
				lanes[lane].setText(lanes[lane].getText() + ">");
				if(i==99) {
					lanes[lane].setText(lanes[lane].getText() + rank);
					rank++;
					stopgame();
				}
				try {
					Thread.sleep(50 + (int)(Math.random()*150));
				} catch (Exception e) {
					break;
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Racing();
	}

}
