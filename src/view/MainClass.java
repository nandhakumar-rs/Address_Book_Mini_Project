package view;

import javax.swing.*;

/**
 * Created by Nandhu on 10-04-2017.
 */
public class MainClass {
    public static  void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new MainFrame();

            }
        });



    }
}
