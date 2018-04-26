package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;



import java.text.*;
public class ConsFunc extends JInternalFrame{
	JButton fechar, pesquisar;
	JLabel pesqpor;
	JComboBox parpesq;
	String campos[] = {"Código", "Cargo","Salário","Sexo", "Nome", "CPF", "RG", "Telefone Residencial", "Telefone Celular", "E-mail", "Data de Nascimento", "Endereço","Número da Residência","CEP","UF","Bairro","Cidade"};
	JTextField pesq_txt;
	ImageIcon pesq;
	public ConsFunc() {
		super("Consulta de Funcionários");
		Container tela = getContentPane();
		setLayout(null);
		
		parpesq = new JComboBox(campos);
		parpesq.setMaximumRowCount(4);
		parpesq.setFont(new Font("Century Gothic", 0, 14));
		parpesq.setBackground(Color.WHITE);
		
		pesquisar = new JButton("");
		pesq_txt = new JTextField(50);
		fechar = new JButton("Fechar");
		pesqpor = new JLabel("Pesquisa por:");
		pesq = new ImageIcon("search.png");
		pesq.setImage(pesq.getImage().getScaledInstance(20,20,100));
		pesquisar.setIcon(pesq);
		
		pesquisar.setBackground(Color.WHITE);
		pesq_txt.setFont(new Font("Century Gothic", 0, 14));
		pesqpor.setFont(new Font("Century Gothic", 1, 14));
		fechar.setFont(new Font("Century Gothic", 1, 15));
		fechar.setBackground(Color.WHITE);
		
		pesquisar.setBounds(250,40,40,20);
		pesq_txt.setBounds(10,40,235,20);
		pesqpor.setBounds(10,10,100,20);
		parpesq.setBounds(110,10,180,20);
		fechar.setBounds(10,190,280,20);
		
		fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar a janela? Todos os dados escritos serão apagados.", " ", JOptionPane.YES_NO_OPTION);
				if(status == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		
		pesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val_pesq = pesq_txt.getText();
			}
		});
		
		tela.add(pesquisar);
		tela.add(pesq_txt);
		tela.add(pesqpor);
		tela.add(parpesq);
		tela.add(fechar);
		setSize(305,250);
		setVisible(true);
	}
}
