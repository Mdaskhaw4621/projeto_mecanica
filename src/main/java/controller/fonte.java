package controller;

import java.awt.Color;
import java.awt.Font;

import javax.swing.table.DefaultTableCellRenderer;

public class fonte extends DefaultTableCellRenderer{
	public void setValue(Object value) {
		setFont(new Font("Century Gothic", 0, 15));
		setForeground(Color.BLACK);
		super.setValue(value);
	}
};