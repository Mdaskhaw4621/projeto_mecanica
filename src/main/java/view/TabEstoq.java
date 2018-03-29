package view;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import controller.FTable;
import controller.fonte;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabEstoq extends JInternalFrame{
	
	JButton fechar;
	JTable tabela;
	Object[][] linha = {null,null,null,null,null};
	
	public TabEstoq()
	{
		
		super("Estoque");
		Container janela = getContentPane();
		setLayout(null);
	
		FTable modelo = new FTable();
		modelo.addColumn("Código");
		modelo.addColumn("Descrição");
		modelo.addColumn("Fornecedor");
		modelo.addColumn("Valor");
		modelo.addColumn("Quant.");
		fechar = new JButton("Fechar");
		
		fechar.setBounds(10,215,500,20);
		fechar.setFont(new Font("Century Gothic", 1, 15));
		fechar.setBackground(Color.WHITE);
		
	tabela = new JTable(modelo);
	
	fonte letras = new fonte();
	
	TableColumn tc = tabela.getColumn("Descrição"); 
	tc.setCellRenderer(letras);
	tc = tabela.getColumn("Descrição"); 
	tc.setCellRenderer(letras);
	tc = tabela.getColumn("Fornecedor"); 
	tc.setCellRenderer(letras);
	tc = tabela.getColumn("Valor"); 
	tc.setCellRenderer(letras);
	tc = tabela.getColumn("Quant."); 
	tc.setCellRenderer(letras);
	
	
	JTableHeader cabecalho = tabela.getTableHeader();
	cabecalho.setFont(new Font("Century Gothic", 0, 16));
	
	JScrollPane barra = new JScrollPane();
	
	barra.setViewportView(tabela);
	
	modelo.addRow(linha);
	modelo.addRow(linha);
	modelo.addRow(linha);
	modelo.addRow(linha);
	
	barra.setBounds(10,10,500,200);
	
	janela.add(fechar);
	
	fechar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar a janela? Todos os dados escritos serão apagados.", " ", JOptionPane.YES_NO_OPTION);
			if(status == JOptionPane.YES_OPTION) {
				dispose();
			}
		}
	});
	
	janela.add(barra);
	
	setSize(530,280);
	setVisible(true);
	}
	
	
}