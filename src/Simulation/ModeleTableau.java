package Simulation;

import javax.swing.table.AbstractTableModel;

public class ModeleTableau extends AbstractTableModel{

    String mat[][];
    String colName[];
    int n;

    public ModeleTableau() {
        n=0;
        mat = new String[n][n+1];
        colName = new String[n+1];
    }
    
    public ModeleTableau(String[][] mat,int n) {
        this.mat = mat;
        this.n = n;
        colName = new String[n+1];
        for(int i=0;i<n;i++)
            colName[i+1] = "P"+i;
    }
    
    @Override
    public int getRowCount() {
        return n;
    }

    @Override
    public int getColumnCount() {
        return n+1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return mat[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colName[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public String[][] getMat() {
        return mat;
    }

    public int getN() {
        return n;
    }

    public void setMat(String[][] mat) {
        this.mat = mat;
    }

    public void setN(int n) {
        this.n = n;
    }

    void setModele(String[][] mat, int nbrPort) {
        this.mat = mat;
        colName = new String[n+1];
        for(int i=0;i<n;i++)
            colName[i+1] = "P"+i;
        fireTableStructureChanged();
    }
    
    
    
    
}
