package Simulation;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Scenario extends AbstractTableModel{

    static ArrayList<String> scenario;

    public Scenario() {
        scenario = new ArrayList<String>();
    }
    
    @Override
    public int getRowCount() {
        return scenario.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return scenario.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return "Chemin";
    }
    
    void addScenario(String[] l)
    {
        if(l!=null)
            for(String s:l)
                if(!scenario.contains(s))
                    scenario.add(s);
    }
    
    void removeScenario(int i)
    {
        scenario.remove(i);
    }
    
    void setScenario(int i,String l)
    {
        scenario.set(i, l);
    }

    public ArrayList<String> getScenario() {
        return scenario;
    }
    
    
}
