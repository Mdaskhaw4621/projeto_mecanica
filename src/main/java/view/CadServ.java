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
	
	JLabel descricao, categoria, valorlabel;
	
	JTextField txtnome, txtdescricao;
	
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
				
		txtnome = new JTextField(50);
		
		txtdescricao = new JTextField(50);
		
		descricao.setBounds(10,0,200,60);
		categoria.setBounds(10,30,200,60);
		valorlabel.setBounds(10,60,200,60);
		
		categoriabox.setBounds(90, 50, 200, 20);
		cadA.setBounds(200,120,90,20);
		limparA.setBounds(105,120,90,20);
		fechar1.setBounds(10,120,90,20);
		txtnome.setBounds(80,20,50,20);
		
		txtdescricao.setBounds(90,20,200,20);
	
		try 
		{
			mascaravalor = new MaskFormatter("####.##");
			mascaravalor.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {}
		
		valor = new JFormattedTextField(mascaravalor);
		
		valor.setBounds(55,80,50,20);
		
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
				if((valor.getText().equals("")) || (txtnome.getText().equals("")) || (txtdescricao.getText().equals(""))) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
				}else {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						String nome, desc;
						int ano, codcli, codfun, codvei;
						nome = txtnome.getText();
						desc = txtdescricao.getText();
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
		
		tela.add(txtdescricao);
		
		tela.add(fechar1);
		
		tela.add(categoriabox);
		
		tela.add(cadA);
		tela.add(limparA);
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(320,200);
		setVisible(true);
	}
}