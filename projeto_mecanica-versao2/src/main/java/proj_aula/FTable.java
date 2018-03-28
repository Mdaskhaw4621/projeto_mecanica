package proj_aula;

import javax.swing.table.DefaultTableModel;

public class FTable extends DefaultTableModel {
	   public FTable() {  
	        super();  
	    }  
	    public boolean isCellEditable(int row, int column) {  
	        return false;  
	    }  
}


//serve para que a tabela estoque não seja editável 