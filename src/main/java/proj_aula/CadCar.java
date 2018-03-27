package proj_aula;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.text.*;

public class CadCar extends JInternalFrame{
	JComboBox tipoveic;
	ButtonGroup grupo;
	JRadioButton arcs, arcn;
	JLabel tipo, placa, marca, modelo, cor, ano, cod_cli, arcond;
	JTextField marca_txt, modelo_txt, codcli_txt, cor_txt;
	JButton limpar, cadastrar, fechar;
	JFormattedTextField placa_txt, ano_txt;
	MaskFormatter mascaraplaca, mascaraano;
	String tpv[] = {"Automóvel", "Motocicleta", "Caminhão", "Caminhonete", "Ônibus", "Microônibus"};
	
	public CadCar() {
		super("Cadastro de Veículos");
		Container tela = getContentPane();
		setLayout(null);
		
		tipoveic = new JComboBox (tpv);
		tipoveic.setMaximumRowCount(4);
		tipoveic.setBounds(50,10,180,20);
		tipoveic.setFont(new Font("Century Gothic", 0, 14));
		tipoveic.setBackground(Color.WHITE);
		
		tipo = new JLabel("Tipo:");
		placa = new JLabel("Placa:");
		marca = new JLabel("Marca:");
		modelo = new JLabel("Modelo:");
		cor = new JLabel("Cor:");
		ano = new JLabel("Ano:");
		arcond = new JLabel("Ar Condicionado:");
		cod_cli = new JLabel("Código do Cliente:");
		limpar = new JButton("Limpar");
		cadastrar = new JButton("Cadastrar");
		fechar = new JButton("Fechar");
		arcs = new JRadioButton("Sim");
		arcn = new JRadioButton("Não");
		grupo = new ButtonGroup();
		grupo.add(arcn);
		grupo.add(arcs);
		
		tipo.setBounds(10,10,40,20);
		tipo.setFont(new Font("Century Gothic", 1, 15));
		placa.setBounds(10,40,70,20);
		placa.setFont(new Font("Century Gothic", 1, 15));
		marca.setBounds(10,70,70,20);
		marca.setFont(new Font("Century Gothic", 1, 15));
		modelo.setBounds(10,100,70,20);
		modelo.setFont(new Font("Century Gothic", 1, 15));
		cor.setBounds(10,130,70,20);
		cor.setFont(new Font("Century Gothic", 1, 15));
		ano.setBounds(140,40,70,20);
		ano.setFont(new Font("Century Gothic", 1, 15));
		cod_cli.setBounds(10,160,150,20);
		cod_cli.setFont(new Font("Century Gothic", 1, 15));
		arcond.setBounds(10,190,150,20);
		arcond.setFont(new Font("Century Gothic", 1, 15));
		arcs.setBounds(140,190,50,20);
		arcs.setFont(new Font("Century Gothic", 0, 12));
		arcn.setBounds(185,190,60,20);
		arcn.setFont(new Font("Century Gothic", 0, 12));
		limpar.setBounds(10,245,120,20);
		limpar.setFont(new Font("Century Gothic", 1, 15));
		cadastrar.setBounds(10,215,120,20);
		cadastrar.setFont(new Font("Century Gothic", 1, 15));
		fechar.setBounds(140,215,90,50);
		fechar.setFont(new Font("Century Gothic", 1, 15));
		
		marca_txt = new JTextField(20);
		modelo_txt = new JTextField(45);
		codcli_txt = new JTextField(5);
		cor_txt = new JTextField(15);
		
		try {
			mascaraplaca = new MaskFormatter("UUU-####");
			mascaraplaca.setPlaceholderCharacter('_');
			mascaraano = new MaskFormatter("####");
			mascaraano.setPlaceholderCharacter(' ');
		}catch(ParseException excp) {}
		
		placa_txt = new JFormattedTextField(mascaraplaca);
		ano_txt = new JFormattedTextField(mascaraano);
		
		placa_txt.setFont(new Font("Century Gothic", 0, 15));
		ano_txt.setFont(new Font("Century Gothic", 0, 16));
		marca_txt.setFont(new Font("Century Gothic", 0, 14));
		modelo_txt.setFont(new Font("Century Gothic", 0, 14));
		cor_txt.setFont(new Font("Century Gothic", 0, 14));
		codcli_txt.setFont(new Font("Century Gothic", 0, 14));
		limpar.setBackground(Color.WHITE);
		fechar.setBackground(Color.WHITE);
		cadastrar.setBackground(Color.WHITE);
		
		placa_txt.setBounds(60,40,75,20);
		ano_txt.setBounds(180,40,50,20);
		marca_txt.setBounds(65,70,165,20);
		modelo_txt.setBounds(75,100,155,20);
		codcli_txt.setBounds(155,160,75,20);
		cor_txt.setBounds(45,130,185,20);
		
		fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar a janela? Todos os dados escritos serão apagados.", " ", JOptionPane.YES_NO_OPTION);
				if(status == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((placa_txt.getText().equals("")) || (modelo_txt.getText().equals("")) || (ano_txt.getText().equals("")) || (cor_txt.getText().equals("")) || (codcli_txt.getText().equals("")) || !((arcs.isSelected()) || (arcn.isSelected()))) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
				}else {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						String placa, modelo, cor;
						boolean arcondicionado;
						int ano, codcliente;
						placa = placa_txt.getText();
						modelo = placa_txt.getText();
						cor = placa_txt.getText();
						ano = Integer.parseInt(ano_txt.getText());
						codcliente = Integer.parseInt(codcli_txt.getText());
						if(arcs.isSelected()) {
							arcondicionado = true;
						}else {
							arcondicionado = false;
						}
						dispose();
					}
				}
			}
		});
		
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				placa_txt.setText("");
				modelo_txt.setText("");
				ano_txt.setText("");
				cor_txt.setText("");
				codcli_txt.setText("");
				marca_txt.setText("");
				tipoveic.setSelectedItem("Automóvel");
			}
		});
		
		tela.add(tipoveic);
		tela.add(tipo);
		tela.add(placa);
		tela.add(marca);
		tela.add(modelo);
		tela.add(cor);
		tela.add(ano);
		tela.add(cod_cli);
		tela.add(placa_txt);
		tela.add(ano_txt);
		tela.add(marca_txt);
		tela.add(modelo_txt);
		tela.add(cor_txt);
		tela.add(codcli_txt);
		tela.add(arcond);
		tela.add(arcs);
		tela.add(arcn);
		tela.add(limpar);
		tela.add(cadastrar);
		tela.add(fechar);
		
		setSize(250,310);
		setVisible(true);
	}
}
