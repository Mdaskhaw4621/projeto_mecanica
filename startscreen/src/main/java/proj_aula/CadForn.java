
package proj_aula;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CadForn extends JInternalFrame{
	JButton limpar, cadastrar, fechar;
	JLabel nome, tel1,tel2,email;
	JTextField txtnome, txtemail;
	JFormattedTextField txttel1, txttel2;
    MaskFormatter mascaratel1, mascaratel2;
    

        public CadForn() {
		super("Cadastro de Fornecedores");
		Container tela = getContentPane();
		setLayout(null);
		
				
                nome = new JLabel("Nome:");
                tel1 = new JLabel("Telefone 1:");
                tel2 = new JLabel("Telefone 2:");
                email = new JLabel("E-Mail:");
                txtnome = new JTextField(50);                
                txtemail = new JTextField(50);
                limpar = new JButton("Limpar");
                cadastrar = new JButton("Cadastrar");
                fechar = new JButton("Fechar");
                  
                
                nome.setBounds(10,10,70,20);
                nome.setFont(new Font("Century Gothic", 1, 15));
                tel1.setBounds(10,40,100,20);
                tel1.setFont(new Font("Century Gothic", 1, 15));
                tel2.setBounds(10,70,100,20);
                tel2.setFont(new Font("Century Gothic", 1, 15));
                email.setBounds(10,100,70,20);
                email.setFont(new Font("Century Gothic", 1, 15));
                limpar.setBounds(10,170,120,20);
                limpar.setFont(new Font("Century Gothic", 1, 15));
                cadastrar.setBounds(10,140,120,20);
                cadastrar.setFont(new Font("Century Gothic", 1, 15));
                fechar.setBounds(140,140,90,50);
                fechar.setFont(new Font("Century Gothic", 1, 15));
                limpar.setBackground(Color.WHITE);
        		fechar.setBackground(Color.WHITE);
        		cadastrar.setBackground(Color.WHITE);
                
                try{
                mascaratel1 = new MaskFormatter("(##)####-####");
                mascaratel2 = new MaskFormatter("(##)####-####");
                mascaratel1.setPlaceholderCharacter('_');
                mascaratel2.setPlaceholderCharacter('_');


                }catch(ParseException excp) {}
                
                txttel1 = new JFormattedTextField(mascaratel1);
                txttel2 = new JFormattedTextField(mascaratel2);
                
                
                txtnome.setBounds(70,10,160,20);
                txttel1.setBounds(110,40,120,20);
                txttel2.setBounds(110,70,120,20);
                txtemail.setBounds(70,100,160,20);
     
                limpar.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				txtnome.setText("");
        				txttel1.setText("");
        				txttel2.setText("");
        				txtemail.setText("");
        				
        			}
        		});
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
        				if((txtnome.getText().equals("")) || (txttel1.getText().equals("")) || (txttel2.getText().equals("")) || (txtemail.getText().equals(""))) {
        					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
        				}else {
        					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
        					if(status == JOptionPane.YES_OPTION) {
        						String cod, nome, tel1, tel2, email;
        						
        						
        						nome = txtnome.getText();
        						tel1 = txttel1.getText();
        						tel2 = txttel2.getText();
        					}
        					dispose();
        				}
        			}
        				}
        				);
        		
        				
                tela.add(nome);
                tela.add(tel1);
                tela.add(tel2);
                tela.add(email);
                tela.add(txtnome);
                tela.add(txttel1);
                tela.add(txttel2);
                tela.add(txtemail);
                tela.add(limpar);
                tela.add(cadastrar);
                tela.add(fechar);
                
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        		setSize(250,230);
        		setVisible(true);

        }
    }
        				
