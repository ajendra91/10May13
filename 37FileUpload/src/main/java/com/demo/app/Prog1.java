package com.demo.app;


import java.io.File;
import java.io.FilenameFilter;

public class Prog1 {

    public static void main(String[] args) {

        File file =new File("loading.css");
        //File file2 =new File("ajay.css");
        //File file3 =new File("newFolder");
        File file4 =new File("src/main/resources");
        /*if(file.renameTo(file2)){
            System.out.println("true");
        }
        if(file3.mkdirs()){
            System.out.println("true");
        }
        if(file3.delete()){
            System.out.println("delete");
        }*/
        FilenameFilter fnf =new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("properties");
            }
        };

        System.out.println(file4.isDirectory());
        String str[] =file4.list(fnf);
        for (String s:str){
            System.out.println(s);
        }

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getParent());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.lastModified());


    }

}
