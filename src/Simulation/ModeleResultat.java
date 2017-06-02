package Simulation;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeleResultat extends AbstractTableModel{

    static ArrayList<String[]> mat;
    String[] nom = new String[]{"IdAPP" , "Energie" , "Latence", "Temps Execution"};

    public ModeleResultat() {
        mat = new ArrayList();
    }
    
    @Override
    public int getRowCount() {
        return mat.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return mat.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nom[column];
    }
    
    void addDonnees(String[] l)
    {
        mat.add(l);
        fireTableDataChanged();
    }
    
    static void clear()
    {
        mat.clear();
    }
}
