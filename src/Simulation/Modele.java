package Simulation;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modele extends AbstractTableModel{

    static ArrayList<String> liens;

    public Modele() {
        liens = new ArrayList<String>();
    }
    
    @Override
    public int getRowCount() {
        return liens.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return liens.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return "Chemin";
    }
    
    void addLien(String[] l)
    {
        if(l!=null)
            for(String s:l)
                if(!liens.contains(s))
                    liens.add(s);
    }
    
    void removeLien(int i)
    {
        liens.remove(i);
    }
    
    void setLien(int i,String l)
    {
        liens.set(i, l);
    }

    public ArrayList<String> getLiens() {
        return liens;
    }
    
    
}
