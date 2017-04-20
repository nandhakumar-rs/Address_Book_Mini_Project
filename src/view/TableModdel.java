package view;

import model.Database;
import model.Person;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by Nandhu on 17-04-2017.
 */
public class TableModdel extends AbstractTableModel{
   private List<Person > db;
   private String[] colum = {"Name","Age","Gender","Phone No","E Mail","City","Pincode","Nationality"};
    public TableModdel() {

    }

    @Override
    public String getColumnName(int column) {
        return colum[column];
    }

    public void setDate(List<Person> db){
       this.db = db;
   }
    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Person person = db.get(rowIndex);
      switch (columnIndex){
          case 0:
              return person.getName();
          case 1:
              return person.getAddress();
          case 2:
              return person.getGen();
          case 3:
              return person.getPhone_no();
          case 4:
              return person.getE_mail();
          case 5:
              return person.getCity();
          case 7:
              if(person.isChk())
              return "YES";
              else
                  return "NO";
          case 6:
              return person.getCode();

      }

          return null;
    }
}
