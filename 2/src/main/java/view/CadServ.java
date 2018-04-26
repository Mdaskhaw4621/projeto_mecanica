package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.text.*;

public class CadServ extends JInternalFrame {

	JButton limparA, cadA, fechar1;
	
	JComboBox categoriabox;
	String campos[] = {"Alinhamento", "Balanceamento", "Mecânica em Geral", "Limpeza de ar condicionado", "Limpeza de bicos", "Trocas de óleos e filtros", "revisão geral/freios", "Serviços Elétricos", "Testar carga de bateria", "Injeção Eletrônica", "Check-up de Suspensão","Cambagem e Caster","Escapamento","Pneus","Elétrica Geral","Lava e Traz"};
	
	JFormattedTextField valor;
	MaskFormatter mascaravalor;
	
	JLabel descricao, categoria, valorlabel, codfun, codcli, codveiculo;
	
	JTextField txtnome, txtdescricao, txtcodfun, txtcodcli, txtcodveiculo;
	
	public CadServ() {
		super("Cadastro de serviços");
		Container tela = getContentPane();
		setLayout(null);
		
		categoriabox = new JComboBox(campos);
		categoriabox.setMaximumRowCount(5);
		categoriabox.setFont(new Font("Century Gothic", 0, 12));
		
		limparA = new JButton("Limpar");
		limparA.setBackground(Color.WHITE);
		limparA.setFont(new Font("Century Gothic", 0, 11));
		cadA = new JButton("Cadastrar");
		cadA.setBackground(Color.WHITE);
		cadA.setFont(new Font("Century Gothic", 0, 11));
		fechar1 = new JButton("Fechar");
		fechar1.setBackground(Color.WHITE);
		fechar1.setFont(new Font("Century Gothic", 0, 11));
		
		descricao = new JLabel("Descrição:");
		descricao.setFont(new Font("Century Gothic", 1, 15));
		categoria = new JLabel("Categoria:");
		categoria.setFont(new Font("Century Gothic", 1, 15));
		valorlabel = new JLabel("Valor:");
		valorlabel.setFont(new Font("Century Gothic", 1, 15));
		codfun = new JLabel("Código do Funcionário:");
		codfun.setFont(new Font("Century Gothic", 1, 15));
		codcli = new JLabel("Cód. do Cliente:");
		codcli.setFont(new Font("Century Gothic", 1, 15));
		codveiculo = new JLabel("Código do Veículo:");
		codveiculo.setFont(new Font("Century Gothic", 1, 15));
				
		txtnome = new JTextField(50);
		
		txtdescricao = new JTextField(50);
		
		txtcodfun = new JTextField(50);
		txtcodcli = new JTextField(20);
		txtcodveiculo = new JTextField(20);
		
		descricao.setBounds(10,10,200,60);
		
		categoria.setBounds(10,40,200,60);
		
		
		codfun.setBounds(10,100,200,60);
		codcli.setBounds(110,70,130,60);
		codveiculo.setBounds(10,130,200,60);
		
		valorlabel.setBounds(10,70,200,60);
		
		categoriabox.setBounds(90, 60, 200, 20);
		cadA.setBounds(200,180,90,20);
		limparA.setBounds(105,180,90,20);
		fechar1.setBounds(10,180,90,20);
		txtnome.setBounds(80,30,50,20);
		
		txtdescricao.setBounds(90,30,200,20);
		
		txtcodfun.setBounds(190,120,100,20);
		txtcodveiculo.setBounds(160,150,130,20);
		txtcodcli.setBounds(233,90,57,20);
	
		try 
		{
			mascaravalor = new MaskFormatter("####.##");
			mascaravalor.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {}
		
		valor = new JFormattedTextField(mascaravalor);
		
		valor.setBounds(55,90,50,20);
		
		fechar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar a janela? Todos os dados escritos serão apagados.", " ", JOptionPane.YES_NO_OPTION);
				if(status == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		

		cadA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((valor.getText().equals("")) || (txtnome.getText().equals("")) || (txtdescricao.getText().equals("")) || (txtcodfun.getText().equals("")) || (txtcodcli.getText().equals("")) || (txtcodveiculo.getText().equals(""))) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
				}else {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						String nome, desc;
						int ano, codcli, codfun, codvei;
						nome = txtnome.getText();
						desc = txtdescricao.getText();
						codcli = Integer.parseInt(txtcodcli.getText());
						codvei = Integer.parseInt(txtcodveiculo.getText());
						codfun = Integer.parseInt(txtcodfun.getText());
						dispose();
					}
				}
			}
		});
		
		limparA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnome.setText("");
				valor.setText("");
				txtdescricao.setText("");
				txtcodfun.setText("");
				txtcodcli.setText("");
				txtcodveiculo.setText("");
				categoriabox.setSelectedItem("Alinhamento");
			}
		});

		fechar1.setToolTipText("Esse botão irá fechar o programa");
		cadA.setToolTipText("Ao clicar aqui, você irá cadastrar os itens digitados");
		limparA.setToolTipText("Ao clicar aqui, você irá limpar os itens digitados");
		
		UIManager.put("ToolTip.background",Color.white);
		UIManager.put("ToolTip.foreground",Color.black);
		
		tela.add(valor);
		tela.add(descricao);
		tela.add(categoria);
		tela.add(valorlabel);
		tela.add(codfun);
		tela.add(codcli);
		tela.add(codveiculo);
		
		tela.add(txtdescricao);
		
		tela.add(txtcodfun);
		tela.add(txtcodcli);
		tela.add(txtcodveiculo);
		
		tela.add(fechar1);
		
		tela.add(categoriabox);
		
		tela.add(cadA);
		tela.add(limparA);
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(320,270);
		setVisible(true);
	}
}