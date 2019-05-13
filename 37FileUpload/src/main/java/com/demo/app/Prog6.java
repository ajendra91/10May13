package com.demo.app;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class Prog6 {

    public static void main(String[] args) throws IOException {


        String str="ajendra is xxxxxxxx";
        char [] ch=new char[str.length()];
        str.getChars(0,str.length(),ch,0);

        CharArrayWriter caw = new CharArrayWriter();
        caw.write(ch);

        System.out.println(caw.toString());

        char ch1[] =caw.toCharArray();
        String str2=new String(ch1);
        System.out.println(str2);

        caw.reset();
        for(int i=0;i<10;i++){
            caw.write((char)i);
        }
        CharArrayReader car=new CharArrayReader(caw.toCharArray());
        int i;
        while ((i=car.read())!=-1){
            System.out.println((char)i);
        }



    }
}
