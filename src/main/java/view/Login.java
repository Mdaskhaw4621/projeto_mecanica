package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {
	JLabel lbl_email, lbl_senha, lbl_logo;
	JTextField txf_email;
	JPasswordField senha;
	JButton btn_entrar, btn_cadastrar;
	About aboutscreen;
	
	public Login() {
		super("RPM Mechanical");
		Container screen = getContentPane();
		screen.setLayout(null);
		
	ImageIcon logo = new ImageIcon("Logo_33.jpg");
	
	 screen.setBackground(Color.WHITE);
	//instanciando e definido a posicao do logo
	 lbl_logo = new JLabel(logo);
	 lbl_logo.setBounds(60, -60, 100, 100);
	 lbl_logo.setSize(500,500);	
	 
	//instanciando os elementos
	lbl_email = new JLabel("E-mail: ");
	lbl_senha = new JLabel("Senha: ");
	txf_email = new JTextField("");
	senha = new JPasswordField();
	btn_entrar = new JButton("Entrar");
	btn_cadastrar = new JButton("Cadastrar-se"); 
	
	//definindo a posicao do elementos
	lbl_email.setBounds(195, 260, 150, 150);
	lbl_senha.setBounds(192, 287, 150, 150);
	txf_email.setBounds(255, 325, 165, 20);
	senha.setBounds(255, 352, 165, 20);
	btn_entrar.setBounds(148, 415, 150, 40);
	btn_cadastrar.setBounds(315, 415, 150, 40);
	
	btn_entrar.setBackground(Color.WHITE);
	btn_cadastrar.setBackground(Color.WHITE);
	
	ImageIcon interrog = new ImageIcon("interrog.png");
	interrog.setImage(interrog.getImage().getScaledInstance(25,25,100));
	ImageIcon about_icon = new ImageIcon("about.png");
	about_icon.setImage(about_icon.getImage().getScaledInstance(25,25,100));
	
	
	JMenuBar bar = new JMenuBar();
	setJMenuBar(bar);
	bar.setBackground(Color.WHITE);	
	JMenu help = new JMenu("Ajuda");
	help.setIcon(interrog);
	bar.add(help);
	JMenuItem about = new JMenuItem("Sobre");
	about.setIcon(about_icon);
	help.add(about);
	
	

	about.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					aboutscreen = new About(null, "Sobre a RPM Mechanical", true);
					aboutscreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					aboutscreen.setVisible(true);
				}
			});
	
	btn_entrar.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String eml = txf_email.getText();
					String sen = new String (senha.getPassword());
					
					dispose();
					Menu mn = new Menu();
					mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			});
	
	//adicionando elementos na tela
	screen.add(lbl_email);
	screen.add(lbl_senha);
	screen.add(txf_email);
	screen.add(senha);
	screen.add(btn_entrar);
	screen.add(btn_cadastrar);
	screen.add(lbl_logo);
	screen.add(bar);
	
	setResizable(false);
	setSize(600,550);
	setLocationRelativeTo(null); 
	setVisible(true);
	}
}
