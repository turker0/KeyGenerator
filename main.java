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
