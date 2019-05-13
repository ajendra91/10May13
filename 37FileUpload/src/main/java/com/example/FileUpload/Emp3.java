package com.example.FileUpload;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp3 {

    public int id;
    public String name;
    public String age;
    public MultipartFile myfile;

}
