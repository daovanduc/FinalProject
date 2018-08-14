package FinalProect.Test.TestPro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoGa extends JFrame {
    JFrame f = new JFrame("Phở Gà");
    JPanel p = new JPanel();


    public PhoGa(){

        JLabel l = new JLabel("Why You Clicked Me");
        l.setSize(250, 20);
        ImageIcon icon = new ImageIcon("doan.jpg");
        JLabel image = new JLabel(icon);
        image.setSize(200,200);




        JButton b = new JButton("close");
        add(b, "South", 1);
        b.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,350);
        setVisible(true);
    }

}
