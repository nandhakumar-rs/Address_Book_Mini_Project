package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nandhu on 10-04-2017.
 */

////////////form for adding a person detail/////////////////
public class DetailPanel extends JPanel {
    private JLabel name,address,phone_no,e_mail,city,countryCode,Gender;
    private JTextField nameField,ageField,phone_noField,e_mailField,cityField,codeField;
    private  JRadioButton male,female;
    private  ButtonGroup genGroup;
    private JButton finish;
    private  JCheckBox indian;
    private EventListener listener;
    public DetailPanel(){
        ///////field initialisation//////////////
        ageField = new JTextField(10);
        nameField = new JTextField(10);
        phone_noField = new JTextField(10);
        e_mailField = new JTextField(10);
        cityField = new JTextField(10);
        codeField = new JTextField(10);
        male = new JRadioButton("male");
        female = new JRadioButton("fermale");
        genGroup = new ButtonGroup();
        genGroup.add(male);
        genGroup.add(female);
        indian = new JCheckBox("INDIAN");
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);
        setBorder(BorderFactory.createTitledBorder("Add Detalis"));
        //////////to have form in grid structure//////////////
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        finish = new JButton("Add");
    male.setSelected(true);
male.setActionCommand("male");
female.setActionCommand("female");
        //////////final button listener to add person///////////////
        finish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = ageField.getText();
                String phone_no = phone_noField.getText();
                String e_mail  = e_mailField.getText();
                String city = cityField.getText();
                String code = codeField.getText();
                String gender = genGroup.getSelection().getActionCommand();
                boolean chk = indian.isSelected();
                //////////////custoim event from custonm  interface//////////////
                Event event = new Event(this,name,address,phone_no,e_mail,city,code,gender,chk);
                listener.eventAdded(event);

            }
        });
        //////First Row/////
        gbc.gridx =0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        name = new JLabel("Name : ");
        add(name,gbc);
        gbc.gridx =1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(nameField,gbc);
        //////Second Row //////
        gbc.gridx =0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.anchor = GridBagConstraints.LINE_END;
        address = new JLabel("Age : ");
        add(address,gbc);
        gbc.gridx =1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(ageField,gbc);
        /////Third Row//////
        gbc.gridx =0;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.anchor = GridBagConstraints.LINE_END;
        Gender= new JLabel("Gender : ");
        add(Gender,gbc);
        gbc.gridx =1;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(male,gbc);
        /////////////fourth row////////////
        gbc.gridx =1;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(female,gbc);
        ///////////fifth row//////////
        gbc.gridx =0;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.anchor = GridBagConstraints.LINE_END;
        phone_no = new JLabel("Phone.no : ");
        add(phone_no,gbc);
        gbc.gridx =1;
        gbc.gridy = 4;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(phone_noField,gbc);
        //////Fourth Row/////
        gbc.gridx =0;
        gbc.gridy = 5;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.anchor = GridBagConstraints.LINE_END;
        e_mail = new JLabel("E-Mail : ");
        add(e_mail,gbc);
        gbc.gridx =1;
        gbc.gridy = 5;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(e_mailField,gbc);
        ////////Fifth Row/////
        gbc.gridx =0;
        gbc.gridy = 6;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.anchor = GridBagConstraints.LINE_END;
        city = new JLabel("City : ");
        add(city,gbc);
        gbc.gridx =1;
        gbc.gridy = 6;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(cityField,gbc);
        /////sixth Row//////
        gbc.gridx =0;
        gbc.gridy = 7;
        gbc.weightx = 1;
        gbc.weighty =0.1;
        gbc.anchor = GridBagConstraints.LINE_END;
        countryCode = new JLabel("Pincode : ");
        add(countryCode,gbc);
        gbc.gridx =1;
        gbc.gridy = 7;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(codeField,gbc);
        /////////seventh field//////////
        gbc.gridx =1;
        gbc.gridy = 8;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.weighty =0.1;
        add(indian,gbc);
        ///////////eightth row/////////
        gbc.gridx =1;
        gbc.gridy = 9;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.weighty =2.0;
        add(finish,gbc);

    }
 public  void setListener(EventListener listener){
        this.listener = listener;
 }
}
