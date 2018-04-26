
package view;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CadFornecimento extends JInternalFrame{
	JButton limpar, cadastrar, fechar;
	JLabel  idprod,idforn,data,qntd;
	JFormattedTextField txtValor,txtData;
        JTextField txtIdprod,txtIdforn, txtqntd;
        MaskFormatter mascaraValor, mascaraData;
    

        public CadFornecimento() {
		super("Cadastro do Fornecimento");
		Container tela = getContentPane();
		setLayout(null);
                
		
                idprod = new JLabel("Id do Produto:");
                idforn = new JLabel("Id do Fornecedor:");
                data = new JLabel("Data de Entrega:");
                qntd = new JLabel("Quantidade:");                
                txtValor = new JFormattedTextField(50);
                txtData = new JFormattedTextField(8);
                limpar = new JButton("Limpar");
                cadastrar = new JButton("Cadastrar");
                fechar = new JButton("Fechar");
                
                
		
		txtValor = new JFormattedTextField(mascaraValor);
                  
                
                
                idprod.setBounds(10,40,100,20);
                idprod.setFont(new Font("Century Gothic", 1, 15));
                idforn.setBounds(10,70,100,20);
                idforn.setFont(new Font("Century Gothic", 1, 15));
                data.setBounds(10,100,70,20);
                data.setFont(new Font("Century Gothic", 1, 15));
                qntd.setBounds(10,130,70,20);
                qntd.setFont(new Font("Century Gothic", 1, 15));
                txtValor.setBounds(10,160,70,20);
                txtValor.setFont(new Font("Century Gothic", 1, 15));
                limpar.setBounds(10,170,120,20);
                limpar.setFont(new Font("Century Gothic", 1, 15));
                cadastrar.setBounds(10,140,120,20);
                cadastrar.setFont(new Font("Century Gothic", 1, 15));
                fechar.setBounds(140,140,90,50);
                fechar.setFont(new Font("Century Gothic", 1, 15));
                limpar.setBackground(Color.WHITE);
        		fechar.setBackground(Color.WHITE);
        		cadastrar.setBackground(Color.WHITE);
                
                try {
			mascaraValor = new MaskFormatter("####.##");
			mascaraValor.setPlaceholderCharacter('_');
                        
                        mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
		}catch(ParseException excp) {}
                
                
               
     
                limpar.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				
        				idprod.setText("");
        				idforn.setText("");
                                        data.setText("");
                                        qntd.setText("");
        				txtValor.setText("");
        				
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
				//Inserir os dados no bd
				if(((data.getText().equals("  /  /    "))  ||  (qntd.getText().equals(" ")) || txtValor.getText().equals("    ,  "))) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
				}else {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						String IdProd, IdForn, Data, valorProd;
						
						
						valorProd = (txtValor.getText());
						IdForn = (idforn.getText());
						Data = (data.getText());                                   
                                                
					}
				}
			}
		});
        		

        		fechar.setToolTipText("Esse botão irá fechar o programa");
        		cadastrar.setToolTipText("Ao clicar aqui, você irá cadastrar os itens digitados");
        		limpar.setToolTipText("Ao clicar aqui, você irá limpar os itens digitados");
        		
        		UIManager.put("ToolTip.background",Color.white);
        		UIManager.put("ToolTip.foreground",Color.black);
        		
               
                tela.add(idprod);
                tela.add(idforn);
                tela.add(data);
                tela.add(qntd);
                tela.add(txtValor);
                tela.add(txtData);
                tela.add(txtIdprod);
                tela.add(txtIdforn);
                tela.add(txtqntd);
                tela.add(limpar);
                tela.add(cadastrar);
                tela.add(fechar);
                
                
              
                                        
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        		setSize(280,330);
        		setVisible(true);

        }
    }