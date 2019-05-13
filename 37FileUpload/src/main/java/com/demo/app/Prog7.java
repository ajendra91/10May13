package com.demo.app;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prog7 {

    public static void main(String[] args) throws IOException {

        String str="ajendra is xxxxxxxx";
        char [] ch=new char[str.length()];
        str.getChars(0,str.length(),ch,0);

        CharArrayWriter caw=new CharArrayWriter();

        FileWriter fw=new FileWriter("ajay.css");

        caw.write(ch);
        //caw.write(fw);


    }
}
