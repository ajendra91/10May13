package com.demo.app;

import java.io.*;
import java.util.Scanner;

public class Prog8 {

    public static void main(String[] args) throws IOException {


        DataInputStream dis =new DataInputStream(System.in);
        String str=dis.readLine();
        System.out.println(str);

        Scanner sc=new Scanner(System.in);
        String str2=sc.next();
        System.out.println(str2);

        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        String str3=br.readLine();
        System.out.println(str3);

        PrintWriter pw =new PrintWriter(System.out,true);
        pw.println("ajendra is here");
        pw.write("ajendra is here");
    }
}
