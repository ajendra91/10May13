package com.demo.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prog3 {

    public static void main(String[] args) throws IOException {

        File file =new File("ajay.css");
        FileReader fr=new FileReader(file);
        BufferedReader br =new BufferedReader(fr);
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
            if(str.equals("animation-name: upper-color-shadow;")){
                System.out.println("1");
            }
        }

    }
}
