package com.lopputyo.student;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import com.lopputyo.student.Student;

public class Filetest {
    private static int Id = 0;
    public static void tiedosto (String name, String lname) throws IOException{
       File f = new File("students.txt");
        
        FileWriter fw = new FileWriter(f,true);

        fw.write(Id+ " " + name + " " + lname + System.lineSeparator());

        Id = Id + 1;
        
        System.out.print("Done");

        fw.close();

    }
}
