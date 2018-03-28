package proj_aula;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.text.*;

public class CadServic extends JInternalFrame {

	JButton limparA, cadA, fechar1;
	
	JComboBox categoriabox;
	String campos[] = {"Alinhamento", "Balanceamento", "Mecânica em Geral", "Limpeza de ar condicionado", "Limpeza de bicos", "Trocas de óleos e filtros", "revisão geral/freios", "Serviços Elétricos", "Testar carga de bateria", "Injeção Eletrônica", "Check-up de Suspensão","Cambagem e Caster","Escapamento","Pneus","Elétrica Geral","Lava e Traz"};
	
	JFormattedTextField valor;
	MaskFormatter mascaravalor;
	
	JLabel descricao, categoria, valorlabel, status, codfun, codcli, codveiculo;
	
	JTextField txtnome, txtdescricao,  txtestoque, txtstatus, txtcodfun, txtcodcli, txtcodveiculo;
	
	public CadServic() {
		super("Cadastro de serviços");
		Container tela = getContentPane();
		setLayout(null);
		
	
		categoriabox = new JComboBox(campos);
		categoriabox.setMaximumRowCount(5);
		categoriabox.setFont(new Font("Century Gothic", 0, 12));
		
		limparA = new JButton("Limpar");
		limparA.setBackground(Color.WHITE);
		limparA.setFont(new Font("Century Gothic", 0, 13));
		cadA = new JButton("Cadastrar");
		cadA.setBackground(Color.WHITE);
		cadA.setFont(new Font("Century Gothic", 0, 13));
		fechar1 = new JButton("Fechar");
		fechar1.setBackground(Color.WHITE);
		fechar1.setFont(new Font("Century Gothic", 0, 13));
		
		descricao = new JLabel("Descrição");
		descricao.setFont(new Font("Century Gothic", 0, 12));
		categoria = new JLabel("Categoria");
		categoria.setFont(new Font("Century Gothic", 0, 12));
		valorlabel = new JLabel("Valor");
		valorlabel.setFont(new Font("Century Gothic", 0, 12));
		status = new JLabel("Status");
		status.setFont(new Font("Century Gothic", 0, 12));
		codfun = new JLabel("Código do Funcionário");
		codfun.setFont(new Font("Century Gothic", 0, 12));
		codcli = new JLabel("Código do Cliente");
		codcli.setFont(new Font("Century Gothic", 0, 12));
		codveiculo = new JLabel("Código do Veículo");
		codveiculo.setFont(new Font("Century Gothic", 0, 12));
				
		txtnome = new JTextField(50);
		
		txtdescricao = new JTextField(50);
		txtstatus = new JTextField(30);
		
		txtcodfun = new JTextField(50);
		txtcodcli = new JTextField(20);
		txtcodveiculo = new JTextField(20);
		
		descricao.setBounds(5,100,200,60);
		status.setBounds(150,100,200,60);
		
		categoria.setBounds(5,130,200,60);
		
		
		codfun.setBounds(5,190,200,60);
		codcli.setBounds(5,220,200,60);
		codveiculo.setBounds(5,250,200,60);
		
		valorlabel.setBounds(5,160,200,60);
		
		categoriabox.setBounds(70, 155, 190, 20);
		cadA.setBounds(95,60,100,20);
		limparA.setBounds(95,90,100,20);
		txtnome.setBounds(80,30,50,20);
		
		txtdescricao.setBounds(70,125,60,20);
		txtstatus.setBounds(190,125,60,20);
		
		txtcodfun.setBounds(140,215,100,20);
		txtcodcli.setBounds(140,245,100,20);
		txtcodveiculo.setBounds(140,275,100,20);
		
		fechar1.setBounds(95,305,100,20);
		
		try 
		{
			mascaravalor = new MaskFormatter("####.##");
			mascaravalor.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {}
		
		valor = new JFormattedTextField(mascaravalor);
		
		valor.setBounds(70,185,60,20);
		
		fechar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar a janela? Todos os dados escritos serão apagados.", " ", JOptionPane.YES_NO_OPTION);
				if(status == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		
		tela.add(valor);
		tela.add(descricao);
		tela.add(categoria);
		tela.add(valorlabel);
		tela.add(status);
		tela.add(codfun);
		tela.add(codcli);
		tela.add(codveiculo);
		
		tela.add(txtdescricao);
		
		tela.add(txtstatus);
		tela.add(txtcodfun);
		tela.add(txtcodcli);
		tela.add(txtcodveiculo);
		
		tela.add(fechar1);
		
		tela.add(categoriabox);
		
		tela.add(cadA);
		tela.add(limparA);
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}
}