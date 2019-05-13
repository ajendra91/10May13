package com.example.FileUpload;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
public class EmpController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam int id, @RequestParam String name, @RequestParam String age,
                       @RequestParam MultipartFile myfile) throws IOException {

       File convFile = new File(myfile.getOriginalFilename());
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(myfile.getBytes());
        fos.close();

        /*byte[] s;
        while ((s=myfile.getBytes())!=null){
            System.out.println(s);
        }*/

        return "success";

    }

    @RequestMapping(value = "/upload2",method = RequestMethod.POST)
    public String upload2(@RequestBody Emp2 emp2) throws IOException {

        File file =emp2.myfile;
        FileReader fr =new FileReader(file);
        BufferedReader br= new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null) {
            System.out.println(s);
        }
        fr.close();
        return "success";

    }

    @RequestMapping(value = "/upload3",method = RequestMethod.POST)
    public String upload3(@RequestBody Emp3 emp3) throws IOException {

        /*MultipartFile multipartFile =emp3.myfile;

        FileReader fr =new FileReader(file);
        BufferedReader br= new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null) {
            System.out.println(s);
        }
        fr.close();*/
        return "success";

    }

    @RequestMapping(value = "/upload4",method = RequestMethod.POST)
    public String add(@RequestBody Emp emp){
        return emp.name;
    }


}
