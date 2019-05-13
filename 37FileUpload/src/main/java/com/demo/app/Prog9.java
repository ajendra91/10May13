package com.demo.app;

import org.apache.tomcat.jni.File;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Prog9 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream("ajay.css");
        String str="xxxx xxxx mmmm xxxxxxxx mmm";
        byte[] b=str.getBytes();
        fos.write(b);
        fos.close();


        FileInputStream fis=new FileInputStream("ajay.css");
        byte b1[]=new byte[50];
        fis.read(b1);
        String str1=new String(b1);
        System.out.println(str1);

    }

    public void fun(MultipartFile file) throws IOException{

        Path path= Paths.get("src/main/resources/ajay");

        Files.createDirectories(path);
        String str= StringUtils.cleanPath(file.getOriginalFilename());
        InputStream is =file.getInputStream();
        //File.copy(is,path.resolve(str));


    }
}
