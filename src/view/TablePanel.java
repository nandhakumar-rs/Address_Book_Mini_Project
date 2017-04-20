package view;

import model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

/**
 * Created by Nandhu on 17-04-2017.
 */
public class TablePanel extends JPanel{
private TableModdel model;
private JTable table;
private JPopupMenu remove;
private  tableListener listener;
    public TablePanel() {
        model = new TableModdel();
      table = new JTable(model);
      remove = new JPopupMenu();
      JMenuItem delete = new JMenuItem("Delete Row");
      remove.add(delete);
      setLayout(new BorderLayout());
      add(new JScrollPane(table),BorderLayout.CENTER);
table.addMouseListener(new MouseAdapter() {
    @Override
    public void mousePressed(MouseEvent e) {
       int row = table.rowAtPoint(e.getPoint());
       table.getSelectionModel().setSelectionInterval(row,row);
       if(e.getButton() == MouseEvent.BUTTON3){
           remove.show(table,e.getX(),e.getY());
       }
    }
});
delete.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int row = table.getSelectedRow();
        if(listener != null){
            listener.rowDeleted(row);
            model.fireTableRowsDeleted(row,row);
        }
    }
});
    }

    public void setData(List<Person> people){
        model.setDate(people);
    }
    public  void  refresh(){
        model.fireTableDataChanged();
    }
    public  void setListener(tableListener listener){
        this.listener = listener;
    }
}
