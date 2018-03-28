package botao_dica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

import java.awt.*;
import java.awt.event.*;

public class exemplos_projeto_mecanica extends JFrame{

	JButton cadastrar, fechar, consultar, limpar;
	
		public exemplos_projeto_mecanica() {
        
        super("Botões com dicas");
        Container tela = getContentPane();
        setLayout(null);
        
        fechar = new JButton("Fechar");
		cadastrar = new JButton("Cadastrar");
		consultar = new JButton("Consultar");
		limpar = new JButton("limpar");
		
		// dica dos botões
		fechar.setToolTipText("Esse botão irá fechar o programa");
		cadastrar.setToolTipText("Ao clicar aqui, você irá cadastrar os itens digitados");
		consultar.setToolTipText("Ao clicar aqui, você irá consultar os itens desejados");
		limpar.setToolTipText("Ao clicar aqui, você irá limpar os itens dados digitados");
		
		// cor das dicas
		UIManager.put("ToolTip.background",Color.black);
		UIManager.put("ToolTip.foreground",Color.red);
		
		
		fechar.setBounds(20,20,80,20);
		cadastrar.setBounds(20,50,80,20);
		consultar.setBounds(20,80,80,20);
		limpar.setBounds(20,110,80,20);
		
		tela.add(fechar);
        tela.add(cadastrar);
        tela.add(consultar);
        tela.add(limpar);
        
		setSize(500, 320);
        setVisible(true);
        setLocationRelativeTo(null); 
        
		}
        
        
	public static void main(String[] args) {
		
		exemplos_projeto_mecanica app = new exemplos_projeto_mecanica();
	      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}}
