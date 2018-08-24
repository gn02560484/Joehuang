package JavaJoe;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mysign extends JFrame{
	private JButton clear,undo,redo,saveJPG,saveObject,loadObject;
	private Myview myview;
	
	public Mysign() {
		super("簽名");
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		saveJPG = new JButton("SaveJPG");
		saveObject = new JButton("SaveObject");
		loadObject = new JButton("LoadObject");
		top.add(clear);top.add(undo);top.add(redo);top.add(saveObject);top.add(loadObject);
		add(top, BorderLayout.NORTH);

		myview = new Myview();
		add(myview, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myview.clear();
			}
		});

		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myview.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myview.redo();
			}
		});

		saveJPG.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		loadObject.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dir4/mysign.obj"));
					myview.setlines((LinkedList<LinkedList<MyPoint>>)ois.readObject());
					ois.close();
				} catch (Exception e1) {
					System.out.println(e1);
				} 
			}
		});
		
		saveObject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveOBJ();
			}
		});

		
		setSize(640,680);
		setVisible(true);  //setvisible 要放在最後面
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void saveJPG() {
		BufferedImage imagebuf = null;
		
	}
	
	private void saveOBJ() {
		LinkedList<LinkedList<MyPoint>> lines = myview.getlines();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dir4/mysign.obj"));
			oos.writeObject(lines);
			
			oos.flush();
			oos.close();
			JOptionPane.showMessageDialog(this, "Save OK");
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mysign mysign = new Mysign();
	}

}
