package proj_aula;
import java.awt.*;
import javax.swing.*;

public class CadFunc extends JInternalFrame{
	JButton limpar, cad;
	JLabel nome;
	JTextField txtnome;
	public CadFunc() {
		super("Cadastro de Funcionários");
		Container tela = getContentPane();
		setLayout(null);
		
		limpar = new JButton("Limpar");
		cad = new JButton("Cadastrar");
		nome = new JLabel("Nome");
		txtnome = new JTextField(50);
		
		nome.setBounds(30,30,50,20);
		cad.setBounds(50,60,100,20);
		limpar.setBounds(50,90,100,20);
		txtnome.setBounds(80,30,50,20);
		
		tela.add(cad);
		tela.add(limpar);
		tela.add(nome);
		tela.add(txtnome);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(250,250);
		setVisible(true);
	}
}
