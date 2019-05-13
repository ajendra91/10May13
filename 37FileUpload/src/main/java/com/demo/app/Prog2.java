package com.demo.app;

import java.io.FileReader;
import java.io.IOException;

public class Prog2 {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("ajay.css");
        char ch [] =new char[5120];
        fr.read(ch);
        String str=new String(ch);
        System.out.println(str);

    }
}
