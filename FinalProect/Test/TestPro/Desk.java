package FinalProect.Test.TestPro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Desk extends JFrame{
    ImageIcon Background;


    JLabel label;
    public Desk() {


        Background = null;
        this.setSize(300,200);
        JPanel jpanel =new JPanel(){
            @Override
            protected  void paintComponent(Graphics g) {
                super.paintComponent(g);
                if(Background!=null)
                {
                    g.drawImage(Background.getImage(),
                            0,0,getWidth(),getHeight(),null);
                }
            }

        };
        setContentPane(jpanel);



        label = new JLabel("INFORMATION ABOUT VIETNAMESE FOODS!");
        label.setForeground(Color.white);
        label.setSize(200, 200);
        add(label,BorderLayout.SOUTH);

        JButton button = new JButton("Information From Jlist!");
        add(button, "South", 1);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JlistT jl = new JlistT();
                setVisible(true);

            }
        });
        JButton button1 = new JButton("Information From Database");
        add(button1,"South",1);
        button1.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDBC db = new JDBC();
                setVisible(true);

            }
        });

    }



    public static void main(String[] args) {
        Desk desk = new Desk();
        desk.setBackground(new ImageIcon("banhmy.jpg"));
        desk.setSize(500, 350);
        desk.setLocation(200, 200);
        desk.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        desk.setVisible(true);




    }

    public void setBackground(ImageIcon background) {
        this.Background = background;
    }
    }


