package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nandhu on 10-04-2017.
 */
public class TextPanel extends JPanel {
    private JTextArea textArea;
    public TextPanel(){
        textArea = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea),BorderLayout.CENTER);
    }
public void setText(String str){
        textArea.append(str);
}
}
