package JavaJoe;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mygame extends JFrame{
	private GamePanel gPanel;
	
	public Mygame(){
		setLayout(new BorderLayout());
		
		gPanel = new GamePanel();
		add(gPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class GamePanel extends JPanel{
		private BufferedImage ball ;
		private int viewW,viewH,ballW,ballH,ballX,ballY;
		private Timer timer;
		private int dx =8,dy = 8;
		private LinkedList<BallTask> balls = new LinkedList<>();
		
		public GamePanel() {
			timer = new Timer();
			ballX = 0;ballY = 0;
			try {
				ball = ImageIO.read(new File("dir1/ball.png"));
				ballW = ball.getWidth();ballH = ball.getHeight();
			} catch (Exception e) {
				System.out.println(e);
			}
			
			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					addBall(e.getX() - (int)(ballW/2f), e.getY() - (int)(ballH/2f));
				}
			});

			timer.schedule(new ViewTask(), 0, 30);
		}
		
		private void addBall(int x,int y) {
			BallTask balltask = new BallTask(x, y);
			timer.schedule(balltask, 500, 6);
			balls.add(balltask);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			viewW = getWidth();viewH = getHeight();
			
			for(BallTask a:balls) {
				g2d.drawImage(ball, a.x, a.y, null);
			}
		}
		
		private class ViewTask extends TimerTask{
			@Override
			public void run() {
				repaint();
			}
			
		}
		
		private class BallTask extends TimerTask{
			int x,y,dx,dy;
			
			public BallTask(int x,int y) {
				this.x = x;
				this.y = y;
				dx = dy = (int)(Math.random()*10)+1;
				//dx = dy = 8;
			}
			
			@Override
			public void run() {
				if(this.x<0 ||this.x + ballW > viewW) {
					dx *= -1;
				}
				if(this.y<0 ||this.y + ballH > viewH) {
					dy *= -1;
				}
				
				this.x += dx;
				this.y += dy;
				//repaint();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mygame mygame = new Mygame();
	}

}
