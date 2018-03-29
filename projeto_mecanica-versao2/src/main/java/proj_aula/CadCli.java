package proj_aula;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.text.*;

public class CadCli extends JInternalFrame {
	
	JComboBox tipopessoa, estados;
	JLabel tipop, nome, cpf, rg, telefoneres, telefonecel, cod_cli, email,endereco,nasc, num, cep, uf, bairro,cidade;
	JTextField codcli_txt,nome_txt,email_txt,endereco_txt,num_txt,bairro_txt,cidade_txt;
	JButton limpar, cadastrar, fechar;
	JFormattedTextField telefoneres_txt, telefonecel_txt, cpf_txt, rg_txt, nasc_txt,cep_txt;
	MaskFormatter mascaracpf, mascararg, mascarares, mascaracel,mascaranasc,mascaracep;
	String tp[] = {"Física - Indefinida","Física - Homem","Física - Mulher", "Jurídica"};
	String cidades[] = {"SP","MG","RJ","ES","BA","PE","RS","AC","AL","AP","AM","CE","DF","GO","MA","MT","MS","PA","PB","PR","PI","RN","RO","RR","SC","SE","TO"};
	
	public CadCli() {
		
		super("Cadastro de Cliente");
		Container tela = getContentPane();
		setLayout(null);
			
		
		tipop = new JLabel("Tipo de Pessoa:");
		tipopessoa = new JComboBox(tp);
		tipopessoa.setMaximumRowCount(4);
		tipopessoa.setBackground(Color.WHITE);
		cod_cli = new JLabel("Código do Cliente:");
		nome = new JLabel("Nome:");
		cpf = new JLabel("CPF:");
		rg = new JLabel("RG:");
		telefoneres = new JLabel("Telefone Residencial:");
		telefonecel = new JLabel("Telefone Celular:");
		email = new JLabel("E-mail:");
		endereco = new JLabel("Endereço:");
		nasc = new JLabel("Data de Nascimento:");
		num = new JLabel("Nº:");
		cep = new JLabel("CEP:");
		estados = new JComboBox (cidades);
		estados.setMaximumRowCount(3);
		estados.setBackground(Color.WHITE);
		uf = new JLabel("UF:");
	    bairro = new JLabel("Bairro:");
	    cidade = new JLabel("Cidade:");
	    limpar = new JButton("Limpar");
		cadastrar = new JButton("Cadastrar");
		fechar = new JButton("Fechar");
	
		limpar.setBackground(Color.WHITE);
		fechar.setBackground(Color.WHITE);
		cadastrar.setBackground(Color.WHITE);
		
		
		nome.setFont(new Font("Century Gothic", 1, 15));
		nome.setBounds(10,55,150,20);
		nome_txt = new JTextField(50);
		nome_txt.setFont(new Font("Century Gothic", 0, 14));
		nome_txt.setBounds(65,55,205,20);
		cpf.setFont(new Font("Century Gothic", 1, 15));
		cpf.setBounds(10,80,150,20);
		rg.setFont(new Font("Century Gothic", 1, 15));
		rg.setBounds(160,80,150,20);
		telefoneres.setFont(new Font("Century Gothic", 1, 15));
		telefoneres.setBounds(10,130,180,20);
		telefonecel.setFont(new Font("Century Gothic", 1, 15));
		telefonecel.setBounds(10,155,180,20);
		email.setFont(new Font("Century Gothic", 1, 15));
		email.setBounds(10,180,180,20);
		endereco.setFont(new Font("Century Gothic", 1, 15));
		endereco.setBounds(10,205,90,20);
		nasc.setFont(new Font("Century Gothic", 1, 15));
		nasc.setBounds(10,105,170,20);
		num.setFont(new Font("Century Gothic", 1, 15));
		num.setBounds(10,230,20,20);
		cep.setFont(new Font("Century Gothic", 1, 15));
		cep.setBounds(160,230,40,20);
		uf.setFont(new Font("Century Gothic", 1, 15));
		uf.setBounds(10,255,40,20);
		bairro.setFont(new Font("Century Gothic", 1, 15));
		bairro.setBounds(110,255,70,20);
		cidade.setFont(new Font("Century Gothic", 1, 15));
		cidade.setBounds(10,285,70,20);
		
		
		tipopessoa.setBounds(135,30,133,20);
		tipopessoa.setFont(new Font("Century Gothic", 0, 14));
		tipop.setFont(new Font("Century Gothic", 1, 15));
		tipop.setBounds(10,30,120,20);
		tipop.setFont(new Font("Century Gothic", 1, 15));
		estados.setBounds(40,255,50,20);
		estados.setFont(new Font("Century Gothic", 0, 14));
		
		
		cod_cli.setBounds(10,5,150,20);
		cod_cli.setFont(new Font("Century Gothic", 1, 15));
		codcli_txt = new JTextField(5);
		codcli_txt.setFont(new Font("Century Gothic", 0, 14));
		codcli_txt.setBounds(155,5,115,20);
		email_txt = new JTextField(50);
		email_txt.setFont(new Font("Century Gothic", 0, 14));
		email_txt.setBounds(65,180,205,20);
		endereco_txt = new JTextField(20);
		endereco_txt.setFont(new Font("Century Gothic", 0, 14));
		endereco_txt.setBounds(90,205,180,20);
		num_txt = new JTextField(5);
		num_txt.setFont(new Font("Century Gothic", 0, 14));
		num_txt.setBounds(40,230,50,20);
		bairro_txt = new JTextField(20);
		bairro_txt.setFont(new Font("Century Gothic", 0, 14));
		bairro_txt.setBounds(160,255,110,20);
		cidade_txt = new JTextField(30);
		cidade_txt.setFont(new Font("Century Gothic", 0, 14));
		cidade_txt.setBounds(80,285,190,20);
		limpar.setBounds(10,345,120,20);
		limpar.setFont(new Font("Century Gothic", 1, 15));
		cadastrar.setBounds(10,315,120,20);
		cadastrar.setFont(new Font("Century Gothic", 1, 15));
		fechar.setBounds(150,315,120,50);
		fechar.setFont(new Font("Century Gothic", 1, 15));
		
		
		try {
			mascaracpf = new MaskFormatter("###.###.###-##");
			mascaracpf.setPlaceholderCharacter('_');
			mascararg = new MaskFormatter("##.###.###-#");
			mascararg.setPlaceholderCharacter('_');
			mascarares= new MaskFormatter("(##)####-####");
			mascarares.setPlaceholderCharacter('_');
			mascaracel= new MaskFormatter("(##)#####-####");
			mascaracel.setPlaceholderCharacter('_');
			mascaranasc= new MaskFormatter("##/##/####");
			mascaranasc.setPlaceholderCharacter('_');
			mascaracep= new MaskFormatter("#####-###");
			mascaracep.setPlaceholderCharacter('_');
			
			
		}catch(ParseException excp) {}
		
		cpf_txt = new JFormattedTextField(mascaracpf);
		cpf_txt.setBounds(50,80,93,20);
		rg_txt = new JFormattedTextField(mascararg);
		rg_txt.setBounds(190,80,80,20);
		telefoneres_txt = new JFormattedTextField(mascarares);
		telefoneres_txt.setBounds(180,130,90,20);
		telefonecel_txt = new JFormattedTextField(mascaracel);
		telefonecel_txt.setBounds(175,155,95,20);
		nasc_txt = new JFormattedTextField(mascaranasc);
		nasc_txt.setBounds(200,105,70,20);
		cep_txt = new JFormattedTextField(mascaracep);
		cep_txt.setBounds(200,230,70,20);
		
	
		



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
				if((codcli_txt.getText().equals("")) || (nome_txt.getText().equals("")) || (email_txt.getText().equals("")) || (endereco_txt.getText().equals("")) || (bairro_txt.getText().equals("")) || (cidade_txt.getText().equals(""))  || (telefoneres_txt.getText().equals(""))|| (telefonecel_txt.getText().equals(""))|| (cpf_txt.getText().equals(""))|| (rg_txt.getText().equals(""))||(nasc_txt.getText().equals(""))|| (cep_txt.getText().equals(""))|| (num_txt.getText().equals(""))  ) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
				}else {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						String nome, email,tipop, endereco,bairro,cidade,telefoneres,telefonecel,nasc;
						int rg, cpf, cep,  codcliente,num;
						
						tipop = tipopessoa.getSelectedItem().toString();
						nome = nome_txt.getText();
						email = email_txt.getText();
						endereco = endereco_txt.getText();
						bairro = bairro_txt.getText();
						cidade = cidade_txt.getText();
						telefoneres = telefoneres_txt.getText();
						telefonecel = telefonecel_txt.getText();
						nasc = nasc_txt.getText();
						
						num = Integer.parseInt(num_txt.getText());
						cep = Integer.parseInt(cep_txt.getText());
						rg = Integer.parseInt(rg_txt.getText());
						cpf = Integer.parseInt(cpf_txt.getText());
						codcliente = Integer.parseInt(codcli_txt.getText());
						
						dispose();
					}
				}
			}
		});

		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome_txt.setText("");
				email_txt.setText("");
				endereco_txt.setText("");
				bairro_txt.setText("");
				codcli_txt.setText("");
				cidade_txt.setText("");
				num_txt.setText("");
				telefoneres_txt.setText("");
				telefonecel_txt.setText("");
				nasc_txt.setText("");
				cep_txt.setText("");
				rg_txt.setText("");
				cpf_txt.setText("");
				codcli_txt.setText("");
				
				tipopessoa.setSelectedItem("Física");
				estados.setSelectedItem("SP");
			}
		});

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		tela.add(cidade_txt);
		tela.add(cidade);
		tela.add(bairro_txt);
		tela.add(bairro);
		tela.add(cep_txt);
		tela.add(cep);
		tela.add(num_txt);
		tela.add(num);
		tela.add(nasc_txt);
		tela.add(nasc);
		tela.add(endereco_txt);
		tela.add(endereco);
		tela.add(email_txt);
		tela.add(email);
		tela.add(telefonecel_txt);
		tela.add(telefonecel);
		tela.add(telefoneres_txt);
		tela.add(telefoneres);
		tela.add(rg_txt);
		tela.add(rg);
		tela.add(cpf);
		tela.add(cpf_txt);
		tela.add(nome_txt);
		tela.add(nome);
		tela.add(codcli_txt);
		tela.add(tipopessoa);	
		tela.add(tipop);
		tela.add(cod_cli);
		tela.add(limpar);
		tela.add(cadastrar);
		tela.add(fechar);
		tela.add(estados);
		tela.add(uf);
	setSize(283,405);
	setVisible(true);
}}




