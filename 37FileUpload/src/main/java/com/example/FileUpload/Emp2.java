package com.example.FileUpload;

import lombok.*;

import java.io.File;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp2 {

    public int id;
    public String name;
    public String age;
    public File myfile;

}
