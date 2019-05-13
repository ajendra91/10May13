package com.demo.app;

import java.io.CharArrayReader;
import java.io.IOException;

public class Prog5 {

    public static void main(String[] args) throws IOException {

        char [] ch={'a','b','a','b','a','b','a','b','a','b','a','b','a','b','a','b'};
        CharArrayReader car=new CharArrayReader(ch);

        int i;
        while ((i=car.read())!=-1){
            System.out.println((char)i);
        }
    }
}
