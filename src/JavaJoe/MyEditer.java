package JavaJoe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.w3c.dom.traversal.NodeFilter;

public class MyEditer extends JFrame{
	private JButton open,save,saveas,newfile;
	private JTextArea editor;
	private File nowFile = null;
	
	
	public MyEditer(){
		super("超級記事本");
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		newfile = new JButton("NEW"); top.add(newfile);
		open = new JButton("OPEN"); top.add(open);
		save = new JButton("SAVE"); top.add(save);
		saveas = new JButton("SAVE AS"); top.add(saveas);
		
		
		add(top,BorderLayout.NORTH);
		editor = new JTextArea();
		JScrollPane jsp = new JScrollPane(editor);
		add(jsp, BorderLayout.CENTER);
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openfile();
			}
		});
		
		save.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				savefile();
			}
		});
		
		saveas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveas();	
			}
		});
		
		newfile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clear();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void openfile() {
		JFileChooser JfileChooser = new JFileChooser();
		if(JfileChooser.showOpenDialog(this) == JfileChooser.APPROVE_OPTION ) {
			nowFile = JfileChooser.getSelectedFile();
			if(nowFile.isFile() && nowFile.canRead() ) {
				readfile();
			}
		}
		
	}
	
	private void readfile() {
		try {
			editor.setText("");
			FileReader reader = new FileReader(nowFile);
			int len = 0; char[] buf = new char[4096];
			
			while ((len = reader.read(buf)) != -1 ) {
				editor.append(new String(buf, 0, len));
				
			}
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	private void savefile() {
		if(nowFile != null) {
			FileWriter filewrite;
			try {
				filewrite = new FileWriter(nowFile);
				editor.write(filewrite);
				JOptionPane.showMessageDialog(this, "OK");;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			saveas();
		}
	}
	
	private void saveas() {
		JFileChooser JfileChooser = new JFileChooser();
		if(JfileChooser.showSaveDialog(this) == JfileChooser.APPROVE_OPTION ) {
			nowFile = JfileChooser.getSelectedFile();
			savefile();
		}
		
	}
	
	private void clear() {
		nowFile = null;
		editor.setText("");
	}
	
	
	
	public static void main(String[] args) {
		MyEditer my = new MyEditer();
	}

}
