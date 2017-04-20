package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Created by Nandhu on 10-04-2017.
 */
public class MainFrame extends JFrame{
    private TextPanel  panel;
    private  DetailPanel Dpanel;
    private JFileChooser fc;
    private TablePanel tablePanel;
    private  Controller controller;

    public MainFrame(){
        super("Address Book");
        setJMenuBar(createMenu());
        panel = new TextPanel();
        Dpanel = new DetailPanel();
        controller = new Controller();
fc = new JFileChooser();
tablePanel = new TablePanel();
    Dpanel.setListener(new EventListener() {
        @Override
        public void eventAdded(Event e) {
   controller.fillList(e);
   tablePanel.refresh();
        }
    });
    tablePanel.setListener(new tableListener() {
        @Override
        public void rowDeleted(int row) {
            controller.removeData(row);
        }
    });
tablePanel.setData(controller.getPeople());
        setSize(500,500);
        setMinimumSize(new Dimension(400,400));
        setLayout(new BorderLayout());
        add(tablePanel,BorderLayout.CENTER);
        add(Dpanel,BorderLayout.WEST);
        Dpanel.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
public  JMenuBar createMenu(){
JMenuBar menuBar = new JMenuBar();
JMenu file = new JMenu("File");
JMenu edit = new JMenu("Edit");
JMenuItem impor= new JMenuItem("Open");
JMenuItem expor = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");
JCheckBoxMenuItem addPerson = new JCheckBoxMenuItem("Add Person");
menuBar.add(file);
menuBar.add(edit);
file.add(impor);
file.add(expor);
file.add(exit);
exit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});
addPerson.setSelected(true);
addPerson.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBoxMenuItem item = (JCheckBoxMenuItem) e.getSource();
            Dpanel.setVisible(item.isSelected());

    }
});
impor.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        fc.addChoosableFileFilter(new choseFile());
        if( fc.showOpenDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION){

                controller.openfile(fc.getSelectedFile());
                tablePanel.refresh();

        }
    }
});
    expor.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            fc.addChoosableFileFilter(new choseFile());
            if( fc.showSaveDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION){

                    controller.savefile(fc.getSelectedFile());
              tablePanel.refresh();

            }
        }
    });
edit.add(addPerson);
impor.setMnemonic(KeyEvent.VK_O);
expor.setMnemonic(KeyEvent.VK_S);
file.setMnemonic(KeyEvent.VK_F);
edit.setMnemonic(KeyEvent.VK_E);
exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
return menuBar;


}

}
