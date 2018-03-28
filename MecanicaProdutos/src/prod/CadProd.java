package prod;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadProd extends JInternalFrame{
	JButton fechar, cad;
	JLabel lblCodigo, lblNome, lblDescricao, valor, lblCategoria, cod;
	JComboBox categoria;
	JTextArea descricao;
	JFormattedTextField txtValor;
	JTextField txtNome;
	MaskFormatter mascaraValor;
	String codi;
	String categorias [] = {"Acessórios", "Arrefecimento","Câmbio e Direção", "Coxins e Batentes", "Embreagem","Ferramentas e Limpezas", "Freios", "Iluminação","Injeção","Motor", "Óleo, Filtro e Aditivos", "Parachoque", "Pneus", "Rolamentos", "Segurança", "Sistema Elétrico", "Multimídia", "Suspensão", "Tuning", "Volantes"}; 
	int cont = 0 ;
	public CadProd() {
		super("Cadastro de Produtos");
		Container tela = getContentPane();
		setLayout(null);
		
		try {
			mascaraValor = new MaskFormatter("####,##");
			mascaraValor.setPlaceholderCharacter(' ');
		}catch(ParseException excp) {}
		
		txtValor = new JFormattedTextField(mascaraValor);
		
		//Codigo gerado pelo BD
		codi = "";
		
		fechar = new JButton("Fechar");
		cad = new JButton("Cadastrar");
		
		//Instância dos objetos
		lblCodigo = new JLabel("Código: ");
		lblNome = new JLabel("Nome: ");
		txtNome = new JTextField(50);
		lblDescricao = new JLabel ("Descrição do Produto: ");
		lblCategoria = new JLabel("Categoria: ");
		valor = new JLabel("Valor: ");
		cod = new JLabel(codi);
		
		descricao= new JTextArea("Digite algo sobre o Produto...");
		categoria = new JComboBox(categorias);
		categoria.setMaximumRowCount(8);
		
		
		//definindo fonte das labels
		lblCodigo.setFont(new Font("Century Gothic", 1, 15));
		lblNome.setFont(new Font("Century Gothic", 1, 15));
		lblDescricao.setFont(new Font("Century Gothic", 1, 15));
		lblCategoria.setFont(new Font("Century Gothic", 1, 15));
		valor.setFont(new Font("Century Gothic", 1, 15));
		cod.setFont(new Font("Century Gothic", 1, 12));
		
		//Definindo posições dos objetos
		lblCategoria.setBounds(30,90,100,20);
		categoria.setBounds(120,90,160,20);
		
		lblCodigo.setBounds(30,30,70,20);
		cod.setBounds(120,30,90,20);
		
		lblNome.setBounds(30,60,70,20);
		txtNome.setBounds(120,60,90,20);
		
		valor.setBounds(30,120,50,20);
		txtValor.setBounds(120,120,50,20);
		
		lblDescricao.setBounds(30,145,200,20);
		descricao.setBounds(50,170,210,100);
		
		cad.setBounds(40,280,100,20);
		cad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Inserir os dados no bd
				if((txtValor.getText().equals("    ,  ")) || (descricao.getText().equals("")) || (descricao.getText().equals("Digite algo sobre o Produto..."))) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
				}else {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						String CodProd, CatProd, DesProd, NomeProd, valorProd;
						
						CodProd = codi;
						valorProd = (txtValor.getText());
						CatProd = categoria.getSelectedItem().toString();
						DesProd = descricao.getText();
						NomeProd = txtNome.getText();
						cont = 1;
					}
				}
			}
		});
		fechar.setBounds(160,280,100,20);
		fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cont != 1) {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente apagar o registro? Todos os dados escritos serão apagados.", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						dispose();		
					}
					}
				else 
					dispose();			
			}
		});
		
		tela.add(cad);
		tela.add(categoria);
		tela.add(lblCodigo);
		tela.add(categoria);
		tela.add(cod);
		tela.add(fechar);
		tela.add(lblDescricao);
		tela.add(descricao);
		tela.add(lblCategoria);
		tela.add(valor);
		tela.add(txtValor);
		tela.add(txtNome);
		tela.add(lblNome);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(330,350);
		setVisible(true);
	}
}

