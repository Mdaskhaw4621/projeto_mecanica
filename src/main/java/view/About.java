package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class About extends JDialog {	
	public About(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		Container screen = getContentPane();
		screen.setLayout(null);
				
		screen.setBackground(Color.WHITE);
				
		String text = "<html> <center>RPM Mechanical <br /> Version: 1.0 <br /> Projeto criado e desenvolvido por: "
						+ "3IIA Turma: B</center>";
		JLabel info = new JLabel(text);
		info.setBounds(100, 100, 400, 300);
		screen.add(info);
						
		setLocationRelativeTo(null);
		setSize(500,500);
		setResizable(false);
		setLocationRelativeTo(null);		
	}
}