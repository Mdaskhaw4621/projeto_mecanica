package view;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.*;

public class CadOrdemServico extends JInternalFrame{
     JLabel CodFunc, CodCli, CodVel, Desc, Obs, DataEnt, DataFim, Valor, CodProdServ;
     JTextField CodFunc_txt, CodCli_txt, CodVel_txt;
     JComboBox CodProdServ_txt;
     JTextArea Desc_txt, Obs_txt;
     JButton limpar, cadastrar, fechar;
     JFormattedTextField DataEnt_txt, DataFim_txt, Valor_txt;
     MaskFormatter mascaradataent, mascaradatafim, mascaravalor;
     public CadOrdemServico() {
         super("Cadastro de Ordens de Serviço");
         Container tela = getContentPane();
	 setLayout(null);
		
	 CodFunc = new JLabel("Código do Funcionário:");	
         CodCli = new JLabel("Código do Cliente:");	
         CodVel = new JLabel("Código do Veículo:");	
         Desc = new JLabel("Descrição do problema:");	
         Obs = new JLabel("Observações Adicionais:");	
         DataEnt = new JLabel("Data de Entrada:");	
         DataFim = new JLabel("Data de Finalização:");	
         Valor = new JLabel("Valor total: R$");	
         CodProdServ = new JLabel("Código do produto ou serviço:");	
         CodFunc_txt = new JTextField(10);
         CodCli_txt = new JTextField(10);
         CodVel_txt = new JTextField(10);
         Desc_txt = new JTextArea();
         Desc_txt.setLineWrap(true);
         Desc_txt.setWrapStyleWord(true);
         Obs_txt = new JTextArea();
         Obs_txt.setLineWrap(true);
         Obs_txt.setWrapStyleWord(true);
         CodProdServ_txt = new JComboBox(); //STRING DOS CODIGOS DE PRODUTOS E SERVIÇOS
         limpar = new JButton("Limpar");
	 cadastrar = new JButton("Cadastrar");
	 fechar = new JButton("Fechar");
         
         try {
             mascaradataent = new MaskFormatter("##/##/####");
             mascaradataent.setPlaceholderCharacter('_');
             mascaradatafim = new MaskFormatter("##/##/####");
             mascaradatafim.setPlaceholderCharacter('_');
             mascaravalor = new MaskFormatter("####.##");
             mascaravalor.setPlaceholderCharacter('_');
	 }catch(ParseException excp) {}
		
	     DataEnt_txt = new JFormattedTextField(mascaradataent);
	     DataFim_txt = new JFormattedTextField(mascaradatafim);
         Valor_txt = new JFormattedTextField(mascaravalor);
               
         CodFunc.setFont(new Font("Century Gothic", 1, 15));
         CodCli.setFont(new Font("Century Gothic", 1, 15));
	 CodVel.setFont(new Font("Century Gothic", 1, 15));
	 Desc.setFont(new Font("Century Gothic", 1, 15));
	 Obs.setFont(new Font("Century Gothic", 1, 15));
	 Valor.setFont(new Font("Century Gothic", 1, 15));
	 CodProdServ.setFont(new Font("Century Gothic", 1, 15));
	 DataEnt.setFont(new Font("Century Gothic", 1, 15));
	 DataFim.setFont(new Font("Century Gothic", 1, 15));
         CodFunc_txt.setFont(new Font("Century Gothic", 0, 15));
	 CodCli_txt.setFont(new Font("Century Gothic", 0, 16));
	 CodVel_txt.setFont(new Font("Century Gothic", 0, 14));
	 Desc_txt.setFont(new Font("Century Gothic", 0, 14));
	 Obs_txt.setFont(new Font("Century Gothic", 0, 14));
	 Valor_txt.setFont(new Font("Century Gothic", 0, 14));
         CodProdServ_txt.setFont(new Font("Century Gothic", 0, 14));
        
         CodFunc.setBounds(10,10,190,20);
	 CodCli.setBounds(10,40,180,20);
	 CodVel.setBounds(10,70,190,20);
	 CodProdServ.setBounds(10,100,230,20);
	 Desc.setBounds(10,130,200,20);
	 Obs.setBounds(320,130,205,20);
	 Valor.setBounds(318,10,120,20);
	 DataEnt.setBounds(318,40,150,20);
	 DataFim.setBounds(318,70,170,20);
		
	 CodFunc_txt.setBounds(200,10,100,20);
	 CodCli_txt.setBounds(165,40,135,20);
	 CodVel_txt.setBounds(172,70,128,20);
	 Desc_txt.setBounds(10,160,280,60);
	 Obs_txt.setBounds(320,160,230,60);
	 Valor_txt.setBounds(440,10,110,20);
         CodProdServ_txt.setBounds(244,100,105,20);
         DataEnt_txt.setBounds(480,40,70,20);
         DataFim_txt.setBounds(480,70,70,20);
         
	 limpar.setBounds(10,230,175,25);
	 limpar.setFont(new Font("Century Gothic", 1, 15));
	 cadastrar.setBounds(195,230,175,25);
	 cadastrar.setFont(new Font("Century Gothic", 1, 15));
	 fechar.setBounds(380,230,170,25);
	 fechar.setFont(new Font("Century Gothic", 1, 15));
	 limpar.setBackground(Color.WHITE);
	 fechar.setBackground(Color.WHITE);
	 cadastrar.setBackground(Color.WHITE);
         
         fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar a janela? Todos os dados escritos serão apagados.", " ", JOptionPane.YES_NO_OPTION);
				if(status == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
         
         limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CodFunc_txt.setText("");
				CodCli_txt.setText("");
				CodVel_txt.setText("");
				Desc_txt.setText("");
				Obs_txt.setText("");
				Valor_txt.setText("");
			}
		});
         
         cadastrar.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				if((CodFunc_txt.getText().equals("")) || (CodCli_txt.getText().equals("")) || (CodVel_txt.getText().equals("")) || (Valor_txt.getText().equals("")) || (DataEnt_txt.getText().equals("")) || (DataFim_txt.getText().equals(""))) {
 					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
 				}else {
 					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
 					if(status == JOptionPane.YES_OPTION) {
 						String codf, codc, codv, datae, dataf;
 						double val;
 						val = Double.parseDouble(Valor_txt.getText());
 						codf = CodFunc_txt.getText();
 						codc = CodCli_txt.getText();
 						codv = CodVel_txt.getText();
 						datae = DataEnt_txt.getText();
 						dataf = DataFim_txt.getText();
 						dispose();
 					}
 				}
 			}
 		});
         

 		fechar.setToolTipText("Esse botão irá fechar o programa");
 		cadastrar.setToolTipText("Ao clicar aqui, você irá cadastrar os itens digitados");
 		limpar.setToolTipText("Ao clicar aqui, você irá limpar os itens digitados");
 		
 		UIManager.put("ToolTip.background",Color.white);
 		UIManager.put("ToolTip.foreground",Color.black);
 		
	 tela.add(CodFunc);	
         tela.add(CodCli);	
         tela.add(CodVel);	
         tela.add(Desc);	
         tela.add(Obs);	
         tela.add(DataEnt);	
         tela.add(DataFim);	
         tela.add(Valor);
         tela.add(CodProdServ);
         tela.add(CodFunc_txt);
         tela.add(CodCli_txt);
         tela.add(CodVel_txt);
         tela.add(Desc_txt);
         tela.add(Obs_txt);
         tela.add(Valor_txt);
         tela.add(CodProdServ_txt);
         tela.add(DataEnt_txt);
         tela.add(DataFim_txt);
	 tela.add(limpar);
	 tela.add(cadastrar);
	 tela.add(fechar);
		
	 setSize(570,300);
	 setVisible(true);
     }
}
