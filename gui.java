package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class gui {
    public gui(String key){
        JFrame frame=new JFrame("Steam Key Generator 2018");
        JPanel panel=new JPanel();
        JButton buton=new JButton();
        JTextArea text=new JTextArea();
        JLabel label=new JLabel();
        JButton buton2=new JButton();


        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel.setSize(200,200);
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);

        buton.setBounds(40,120,100,25);
        buton.setText("Generate !");
        buton2.setBounds(40,120,100,25);
        buton2.setText("Exit");
        buton2.setVisible(false);
        text.setBounds(30,80,150,20);
        text.setVisible(false);
        text.setOpaque(false);

        label.setBounds(20,10,200,50);
        label.setText("Steam Key Generator 2018");

        panel.add(label);
        panel.add(buton);
        panel.add(text);
        panel.add(buton2);
        frame.add(panel);

        frame.setVisible(true);


        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(key);
                text.setVisible(true);
                buton.setText("Success !");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                buton.setVisible(false);
                buton2.setVisible(true);
            }
        });

        buton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });


    }
}
