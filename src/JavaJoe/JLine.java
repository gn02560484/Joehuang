package JavaJoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JLine extends JFrame {
	private JButton enter;
	private JTextField inpute ;
	private JTextArea hist ;
	private JTextArea memList;
	
	public JLine(){
		super("JLine");
		enter = new JButton("輸入");
		inpute = new JTextField();
		hist = new JTextArea();
		memList = new JTextArea();
		hist.setFont(new Font("default",Font.BOLD , 24));
		
		setLayout(new BorderLayout());
		
		JPanel butt = new JPanel(new BorderLayout());
		butt.add(inpute, BorderLayout.CENTER);
		butt.add(enter, BorderLayout.EAST);
		
		add(butt, BorderLayout.SOUTH);
		add(hist, BorderLayout.CENTER);
		add(memList, BorderLayout.EAST);
		memList.setBackground(Color.PINK);
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chat();
			}
		});
		inpute.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					chat();
				}
			}
		});
		
		setVisible(true);
		setSize(680, 680);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		while(true) {
			System.out.println("receive message OK1-1");
			LinkedList<String> message = receiveMes();
			for(String line: message) {
				System.out.println("receive message OK1-2");
				hist.append(line + "\n");
				System.out.println("receive message OK1-3");
			}
		}
		
	}
	
	void chat() {
		hist.append("我: "+ inpute.getText()+"\n");

		
		Socket socket;
		try {
			socket = new Socket("192.168.0.2", 8889);
			OutputStream ops = socket.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(ops);
//			osw.write("from 192.168.0.2 :" + inpute.getText());
			ops.write(("from 192.168.0.2 :".concat(inpute.getText())).getBytes());
			System.out.println("send out message OK1");
			

			ops.flush();
			ops.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		
		inpute.setText("");
		inpute.requestFocus();
		
		
	}
	
	LinkedList<String> receiveMes() {
		ServerSocket server;
		LinkedList<String> message = new LinkedList<>();
		try {
			server = new ServerSocket(8889);
			Socket socket = server.accept();
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String line;
			System.out.println("receive message OK2");

			while((line=br.readLine()) != null ) {
				System.out.println("line"+line);
				message.add(line);
			}
			System.out.println(message);
			System.out.println("receive message OK3");
			isr.close();
			br.close();
			
			server.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return message;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLine Jline = new JLine();
	}

}
