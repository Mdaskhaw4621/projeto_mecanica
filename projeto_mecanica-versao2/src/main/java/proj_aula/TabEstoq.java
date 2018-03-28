package proj_aula;

	import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import java.awt.*;

public class TabEstoq extends JInternalFrame{
	
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
	
	
	janela.add(barra);
	
	setSize(550,300);
	setVisible(true);
	}
	
	
}

