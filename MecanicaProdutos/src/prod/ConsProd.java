package prod;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConsProd extends JInternalFrame{
	String CodProd, CatProd, DesProd, NomeProd;
	int cont = 0 ;
	double valorProd;
	JButton consultar;
	JLabel codigo, nome, lblCodProd, lblCatProd, lblDesProd, lblNomeProd, lblValorProd1, lblCodProd1, lblCatProd1, lblDesProd1, lblNomeProd1, lblValorProd;
	JTextField txtCod, txtNome;
	
	
	public ConsProd() {
		super("Consulta de Produtos");  
		Container tela = getContentPane();
		setLayout(null);
		
		codigo = new JLabel ("Código do Produto: ");
		nome = new JLabel ("Nome do Produto: ");
		consultar = new JButton("Consultar");
		txtCod = new JTextField();
		txtNome = new JTextField();
		
		lblCodProd = new JLabel ("Código: ");
		lblCatProd = new JLabel ("Categoria: ");
		lblDesProd = new JLabel ("Descrição: ");
		lblNomeProd = new JLabel ("Nome: ");	
		lblValorProd = new JLabel ("Valor: ");
		
		lblCodProd1 = new JLabel ("-");
		lblCatProd1 = new JLabel ("-");
		lblDesProd1 = new JLabel ("-");
		lblNomeProd1 = new JLabel ("-");	
		lblValorProd1 = new JLabel ("-");
		
		lblCodProd.setVisible(false);
		lblCatProd.setVisible(false);
		lblDesProd.setVisible(false);
		lblNomeProd.setVisible(false);	
		lblValorProd.setVisible(false);
		
		lblCodProd1.setVisible(false);
		lblCatProd1.setVisible(false);
		lblDesProd1.setVisible(false);
		lblNomeProd1.setVisible(false);	
		lblValorProd1.setVisible(false);
		
		lblCodProd.setBounds(30, 120, 100, 20);
		lblNomeProd.setBounds(30, 140, 100, 20);
		lblCatProd.setBounds(30, 160, 100, 20);
		lblDesProd.setBounds(30, 180, 100, 20);	
		lblValorProd.setBounds(30, 200, 100, 20);
		
		lblCodProd1.setBounds(130, 120, 100, 20);
		lblNomeProd1.setBounds(130, 140, 100, 20);
		lblCatProd1.setBounds(130, 160, 100, 20);
		lblDesProd1.setBounds(130, 180, 100, 20);	
		lblValorProd1.setBounds(130, 200, 100, 20);
		
		codigo.setBounds(30,30,160,20);
		txtCod.setBounds(180,30,100,20);
		nome.setBounds(30,60,160,20);
		txtNome.setBounds(180,60,100,20);
		consultar.setBounds(30,90,100,20);
		
		codigo.setFont(new Font("Century Gothic", 1, 15));
		nome.setFont(new Font("Century Gothic", 1, 15));
		
		lblCodProd.setFont(new Font("Century Gothic", 1, 15));
		lblCatProd.setFont(new Font("Century Gothic", 1, 15));
		lblDesProd.setFont(new Font("Century Gothic", 1, 15));
		lblNomeProd.setFont(new Font("Century Gothic", 1, 15));
		lblValorProd.setFont(new Font("Century Gothic", 1, 15));
		
		lblCodProd1.setFont(new Font("Century Gothic", 1, 12));
		lblCatProd1.setFont(new Font("Century Gothic", 1, 12));
		lblDesProd1.setFont(new Font("Century Gothic", 1, 12));
		lblNomeProd1.setFont(new Font("Century Gothic", 1, 12));
		lblValorProd1.setFont(new Font("Century Gothic", 1, 12));
		
		consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Consultar no bd e importar dados
				
				//CodProd = do bd... 
				if(txtCod.getText().equals("") && txtNome.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, no mínimo um campo deve ser preenchido!");
				}
				/*else if (consulta inválida) {
				 * lblCodProd1.setText("-");
				lblCatProd1.setText("-");
				lblDesProd1.setText("-");
				lblNomeProd1.setText("-");	
				lblValorProd1.setText("-");
				
				lblCodProd.setVisible(true);
				lblCatProd.setVisible(true);
				lblDesProd.setVisible(true);
				lblNomeProd.setVisible(true);	
				lblValorProd.setVisible(true);
				
				lblCodProd1.setVisible(true);
				lblCatProd1.setVisible(true);
				lblDesProd1.setVisible(true);
				lblNomeProd1.setVisible(true);	
				lblValorProd1.setVisible(true);
				 * }*/
				else {
				lblCodProd1.setText(CodProd);
				lblCatProd1.setText(CatProd);
				lblDesProd1.setText(DesProd);
				lblNomeProd1.setText(NomeProd);	
				lblValorProd1.setText(""+valorProd);
				
				lblCodProd.setVisible(true);
				lblCatProd.setVisible(true);
				lblDesProd.setVisible(true);
				lblNomeProd.setVisible(true);	
				lblValorProd.setVisible(true);
				
				lblCodProd1.setVisible(true);
				lblCatProd1.setVisible(true);
				lblDesProd1.setVisible(true);
				lblNomeProd1.setVisible(true);	
				lblValorProd1.setVisible(true);
				}
			}
		});
		tela.add(codigo);
		tela.add(consultar);
		tela.add(nome);
		tela.add(txtNome);
		tela.add(txtCod);
		tela.add(lblCodProd);
		tela.add(lblCatProd);
		tela.add(lblDesProd);
		tela.add(lblNomeProd);
		tela.add(lblValorProd);
		tela.add(lblCodProd1);
		tela.add(lblCatProd1);
		tela.add(lblDesProd1);
		tela.add(lblNomeProd1);
		tela.add(lblValorProd1);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize (300,280);
		setVisible(true);
	}
}
