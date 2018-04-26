package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.text.*;

public class CadFunc2 extends JFrame {
	
	JComboBox estados,sexos;
	JLabel   sexo, salario, cargo, nome, cpf, rg, telefoneres, telefonecel, cod_func, email,endereco,nasc, num, cep, uf, bairro,cidade;
	JTextField cargo_txt,codfunc_txt,nome_txt,email_txt,endereco_txt,num_txt,bairro_txt,cidade_txt;
	JButton limpar, cadastrar, fechar;
	JFormattedTextField salario_txt,telefoneres_txt, telefonecel_txt, cpf_txt, rg_txt, nasc_txt,cep_txt;
	MaskFormatter mascaracpf, mascarasa, mascararg, mascarares, mascaracel,mascaranasc,mascaracep;
	String s[] = {"Masculino","Feminino"};
	String cidades[] = {"SP","MG","RJ","ES","BA","PE","RS","AC","AL","AP","AM","CE","DF","GO","MA","MT","MS","PA","PB","PR","PI","RN","RO","RR","SC","SE","TO"};
	
	public CadFunc2() {
		
		super("Cadastro de Funcionário");
		Container tela = getContentPane();
		setLayout(null);
			
		
		
		cod_func = new JLabel("Código do Funcionário:");
		sexo = new JLabel("Sexo:");
		cargo = new JLabel("Cargo:");
		salario = new JLabel ("Salário:");
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
		
		sexos = new JComboBox(s);
		sexos.setMaximumRowCount(3);
		sexos.setBounds(185,55,85,20);
		sexos.setBackground(Color.WHITE);
		
		sexo.setFont(new Font("Century Gothic", 1, 15));
		sexo.setBounds(140,54,50,20);
		salario.setFont(new Font("Century Gothic", 1, 15));
		salario.setBounds(10,55,150,20);
		nome.setFont(new Font("Century Gothic", 1, 15));
		nome.setBounds(10,80,150,20);
		nome_txt = new JTextField(50);
		nome_txt.setFont(new Font("Century Gothic", 0, 14));
		nome_txt.setBounds(65,80,205,20);
		
		cpf.setFont(new Font("Century Gothic", 1, 15));
		cpf.setBounds(10,105,150,20);
		rg.setFont(new Font("Century Gothic", 1, 15));
		rg.setBounds(160,105,150,20);
		telefoneres.setFont(new Font("Century Gothic", 1, 15));
		telefoneres.setBounds(10,155,180,20);
		telefonecel.setFont(new Font("Century Gothic", 1, 15));
		telefonecel.setBounds(10,180,180,20);
		email.setFont(new Font("Century Gothic", 1, 15));
		email.setBounds(10,205,180,20);
		endereco.setFont(new Font("Century Gothic", 1, 15));
		endereco.setBounds(10,230,90,20);
		nasc.setFont(new Font("Century Gothic", 1, 15));
		nasc.setBounds(10,130,170,20);
		num.setFont(new Font("Century Gothic", 1, 15));
		num.setBounds(10,255,20,20);
		cep.setFont(new Font("Century Gothic", 1, 15));
		cep.setBounds(160,254,40,20);
		uf.setFont(new Font("Century Gothic", 1, 15));
		uf.setBounds(10,280,40,20);
		bairro.setFont(new Font("Century Gothic", 1, 15));
		bairro.setBounds(110,280,70,20);
		cidade.setFont(new Font("Century Gothic", 1, 15));
		cidade.setBounds(10,305,70,20);
		cargo_txt = new JTextField(50);
		cargo_txt.setBounds(70,30,200,20);
		cargo_txt.setFont(new Font("Century Gothic", 0, 14));
		cargo.setFont(new Font("Century Gothic", 1, 15));
		cargo.setBounds(10,30,120,20);
	
		estados.setBounds(40,280,50,20);
		estados.setFont(new Font("Century Gothic", 0, 14));
		
		
		cod_func.setBounds(10,5,200,20);
		cod_func.setFont(new Font("Century Gothic", 1, 15));
		codfunc_txt = new JTextField(5);
		codfunc_txt.setFont(new Font("Century Gothic", 0, 14));
		codfunc_txt.setBounds(190,5,80,20);
		email_txt = new JTextField(50);
		email_txt.setFont(new Font("Century Gothic", 0, 14));
		email_txt.setBounds(65,205,205,20);
		endereco_txt = new JTextField(20);
		endereco_txt.setFont(new Font("Century Gothic", 0, 14));
		endereco_txt.setBounds(90,230,180,20);
		num_txt = new JTextField(5);
		num_txt.setFont(new Font("Century Gothic", 0, 14));
		num_txt.setBounds(40,255,50,20);
		bairro_txt = new JTextField(20);
		bairro_txt.setFont(new Font("Century Gothic", 0, 14));
		bairro_txt.setBounds(160,280,110,20);
		cidade_txt = new JTextField(30);
		cidade_txt.setFont(new Font("Century Gothic", 0, 14));
		cidade_txt.setBounds(80,305,190,20);
		limpar.setBounds(10,365,120,20);
		limpar.setFont(new Font("Century Gothic", 1, 15));
		cadastrar.setBounds(10,335,120,20);
		cadastrar.setFont(new Font("Century Gothic", 1, 15));
		fechar.setBounds(150,335,120,50);
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
			mascarasa = new MaskFormatter("#####.##");
			mascarasa.setPlaceholderCharacter('_');
			
		}catch(ParseException excp) {}
		
		salario_txt = new JFormattedTextField(mascarasa);
		salario_txt.setBounds(70,55,60,20);
		cpf_txt = new JFormattedTextField(mascaracpf);
		cpf_txt.setBounds(50,105,93,20);
		rg_txt = new JFormattedTextField(mascararg);
		rg_txt.setBounds(190,105,80,20);
		telefoneres_txt = new JFormattedTextField(mascarares);
		telefoneres_txt.setBounds(180,155,90,20);
		telefonecel_txt = new JFormattedTextField(mascaracel);
		telefonecel_txt.setBounds(175,180,95,20);
		nasc_txt = new JFormattedTextField(mascaranasc);
		nasc_txt.setBounds(200,130,70,20);
		cep_txt = new JFormattedTextField(mascaracep);
		cep_txt.setBounds(200,255,70,20);
		
	
		



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
				if((codfunc_txt.getText().equals("")) || (cargo_txt.getText().equals(""))|| (salario_txt.getText().equals(""))|| (nome_txt.getText().equals("")) || (email_txt.getText().equals("")) || (endereco_txt.getText().equals("")) || (bairro_txt.getText().equals("")) || (cidade_txt.getText().equals(""))  || (telefoneres_txt.getText().equals(""))|| (telefonecel_txt.getText().equals(""))|| (cpf_txt.getText().equals(""))|| (rg_txt.getText().equals(""))||(nasc_txt.getText().equals(""))|| (cep_txt.getText().equals(""))|| (num_txt.getText().equals(""))  ) {
					JOptionPane.showMessageDialog(null, "Confira o preenchimento dos dados, existem campos em branco!");
				}else {
					int status = JOptionPane.showConfirmDialog(null,"Deseja realmente enviar os dados?", " ", JOptionPane.YES_NO_OPTION);
					if(status == JOptionPane.YES_OPTION) {
						String nome, cargo, email, sexo,endereco,bairro,cidade,telefoneres,telefonecel,nasc;
						int salario, rg, cpf, cep,  codcliente,num;
						
						sexo = sexos.getSelectedItem().toString();
						cargo = cargo_txt.getText();
						nome = nome_txt.getText();
						email = email_txt.getText();
						endereco = endereco_txt.getText();
						bairro = bairro_txt.getText();
						cidade = cidade_txt.getText();
						telefoneres = telefoneres_txt.getText();
						telefonecel = telefonecel_txt.getText();
						nasc = nasc_txt.getText();
						
						
						salario = Integer.parseInt(salario_txt.getText());
						num = Integer.parseInt(num_txt.getText());
						cep = Integer.parseInt(cep_txt.getText());
						rg = Integer.parseInt(rg_txt.getText());
						cpf = Integer.parseInt(cpf_txt.getText());
						codcliente = Integer.parseInt(codfunc_txt.getText());
						
						dispose();
					}
				}
			}
		});

		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargo_txt.setText("");
				salario_txt.setText("");
				nome_txt.setText("");
				email_txt.setText("");
				endereco_txt.setText("");
				bairro_txt.setText("");
				codfunc_txt.setText("");
				cidade_txt.setText("");
				num_txt.setText("");
				telefoneres_txt.setText("");
				telefonecel_txt.setText("");
				nasc_txt.setText("");
				cep_txt.setText("");
				rg_txt.setText("");
				cpf_txt.setText("");
				codfunc_txt.setText("");
				
				sexos.setSelectedItem("Indefinido");
				estados.setSelectedItem("SP");
			}
		});
		fechar.setToolTipText("Esse botão irá fechar o programa");
		cadastrar.setToolTipText("Ao clicar aqui, você irá cadastrar os itens digitados");
		limpar.setToolTipText("Ao clicar aqui, você irá limpar os itens digitados");
		
		UIManager.put("ToolTip.background",Color.white);
		UIManager.put("ToolTip.foreground",Color.black);
		
		tela.add(sexos);
		tela.add(sexo);
		tela.add(salario);
		tela.add(salario_txt);
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
		tela.add(codfunc_txt);
		tela.add(cargo_txt);
		tela.add(cargo);
		tela.add(cod_func);
		tela.add(limpar);
		tela.add(cadastrar);
		tela.add(fechar);
		tela.add(estados);
		tela.add(uf);
		
	setResizable(false);
	setSize(293,428);
	setVisible(true);
}}


