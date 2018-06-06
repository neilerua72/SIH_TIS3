/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aurélien
 */
public class ModelTable extends DefaultTableModel{

    ModelTable(String[][] tab, String[] string) {
        super(tab,string);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
}
