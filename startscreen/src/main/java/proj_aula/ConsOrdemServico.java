package proj_aula;

import java.awt.Container;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConsOrdemServico extends JInternalFrame{
        JButton fechar, pesquisar;
	JLabel pesqpor;
	JComboBox parpesq;
	String campos[] = {"Código do Funcionário", "Código do Cliente", "Código do Veículo", "Descrição do problema", "Observações Adicionais", "Data de Entrada", "Data de Finalização", "Valor total: R$", "Código do produto ou serviço"};
        JTextField pesq_txt;
	ImageIcon pesq;
	public ConsOrdemServico() {
		super("Consulta de Ordens de Serviço");
		Container tela = getContentPane();
		setLayout(null);
		
		parpesq = new JComboBox(campos);
		parpesq.setMaximumRowCount(4);
		parpesq.setFont(new Font("Century Gothic", 0, 14));
		parpesq.setBackground(Color.WHITE);
		
		pesquisar = new JButton("");
		pesq_txt = new JTextField(25);
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
		
		pesquisar.setBounds(275,40,30,20);
		pesq_txt.setBounds(10,40,250,20);
		pesqpor.setBounds(10,10,100,20);
		parpesq.setBounds(100,10,205,20);
		fechar.setBounds(10,190,295,20);
		
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
		setSize(325,250);
		setVisible(true);
	}
}