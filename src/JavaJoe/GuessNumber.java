package JavaJoe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea hist;
	private String answer = createAnswer();
	private int count = 0;

	
	
 	public GuessNumber() {
		super("猜數字遊戲");// 視窗名稱, jfram的建構式
		
		guess = new JButton("猜");
		input = new JTextField();
		hist = new JTextArea();
		hist.setFont(new Font("default",Font.BOLD , 24));
		//input.setVisible(true);

		
		setLayout(new BorderLayout()); //設計guessnumber 的版面
		add(hist, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());//做一個名稱為top的小區塊版面
		top.add(guess,BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top,BorderLayout.NORTH);//將做好的top放進去
		
		guess.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doGuess();
				
			}
		});
		
		input.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(e.getKeyCode());
				if(e.getKeyCode()==10) {
					doGuess();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		System.out.println(answer);
	}

	
	void doGuess() {
		//System.out.println(checkvalid(input.getText()));
		boolean valid = checkvalid(input.getText());
		input.requestFocus();
		boolean restart = false;
		
		if(valid) {
			String result = checkAB();
			hist.append(input.getText() + "=>" + result+ "\n");
			
			if(result.equals("3A0B")) {
				JOptionPane.showMessageDialog(null, "bingo!!!");
				restart = true;
			}else{count++;}
			if(count >=3) {
				JOptionPane.showMessageDialog(null, "魯蛇!!  answer = " + answer   );
				restart = true;
			}
		}
		
		if(restart) {
			hist.setText("");
			this.answer = createAnswer();
			this.count = 0;
			System.out.println(this.answer);
		}
		input.setText("");
	}
	
	String checkAB() {
		int a,b;a=b=0;
		String guess = input.getText();
		for(int i=0; i<guess.length(); i++ ) {
			if(guess.charAt(i)==answer.charAt(i)) {
				a++;
			}else if(answer.indexOf(guess.charAt(i)) != -1) {
				b++;
			}
			
		}
		return a + "A" + b + "B";
	}

	String createAnswer() {

		int[] poker = new int[10];
		int pick = 0;
		
		for(int i=0; i<poker.length; i++) {
			poker[i] = i;
		}
		  
	//	System.out.println("------------shuffle star---------------------------");
		
		for(int i=0; i<poker.length; i++) {
			int lastp = poker.length - i;
			int a = 0;
			pick = (int)(Math.random() * lastp);
			a = poker[lastp -1];
			poker[lastp -1] = poker[pick];
			poker[pick] = a;

			}
	
		return "" +poker[0] + poker[1] + poker[2] ;//String和int放在一起, 全部視為String
	}
	
	boolean checkvalid(String input) {
		boolean valid = false;
		if(input.matches("^[0-9]{3}$")) {
			valid = true;
		}
		return valid;
	}
	
	
	public static void main(String[] args) {
		new GuessNumber();

	}

}
