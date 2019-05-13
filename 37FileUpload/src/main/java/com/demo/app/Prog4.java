package com.demo.app;

import java.io.FileWriter;
import java.io.IOException;

public class Prog4 {

    public static void main(String[] args) throws IOException {

        String str="ajendra is here";
        char ch[]=new char[str.length()];
        str.getChars(0,str.length(),ch,0);

        FileWriter fw=new FileWriter("ajay.css");

        for(int i=0;i<ch.length;i++){
            fw.write(ch[i]);
        }

        fw.close();

    }
}
