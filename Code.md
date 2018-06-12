# KeyGenerator
#### Main Class #######
package main;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class main {

    public static String generate(){
        String[] random={"A","B","C","D","E","F","G","H","I","J",
                "K","L","M","N","O","P","R","S","T","U",
                "V","Y","Z","X","W","Q","0","1","2","3",
                "4","5","6","7", "8","9"};

        int[] ints = new Random().ints(1, 36).distinct().limit(16).toArray();
        String[] key=new String[16];

        for(int i=0;i<16;i++){
            key[i]=random[ints[i]];
        }


        String str="";
        for(int i=0;i<16;i++){
            if(i==4||i==8||i==12){
                str=str+"-";
            }
            str=str+key[i];
        }

        return str;
            }

    public static void main(String args[]){
        new gui(generate());

    }

}



#### 2.nd Class Codes  For Gui #####
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
