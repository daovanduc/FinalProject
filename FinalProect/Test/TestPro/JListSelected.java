package FinalProect.Test.TestPro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JListSelected extends JFrame {

    public JListSelected(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set layout
        getContentPane().setLayout(new FlowLayout());
        //ArrayList
        ArrayList<String> items = new ArrayList<String>();
        //Add data for Arraylist
        for(int i=0 ;i<10 ;i++){
            items.add("items"+i);

        }

       /* item.add("Phở Gà");
        item.add("Phở Bò");
        item.add("bánh Mỳ")*/
       final JList jlist = new JList(items.toArray());
        getContentPane().add(jlist);
        JButton btn = new JButton("Selected");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] indices = jlist.getSelectedIndices();
                for(int i=0;i<indices.length;i++ ){
                    System.out.println("items"+i);
                }



            }
        });
        setSize(500,350);

    }

    public static void main(String[] args) {

        new JListSelected().setVisible(true);

    }

}

