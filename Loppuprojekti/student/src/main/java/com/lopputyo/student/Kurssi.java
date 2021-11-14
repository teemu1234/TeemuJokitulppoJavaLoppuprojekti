

package com.lopputyo.student;
import com.lopputyo.student.Student;
import java.util.List;

public class Kurssi {
    private final long courseId;
    public static long courseCount = 0;
    private String teacher; 
    private String courseName;


    public Kurssi(long courseId, String courseName, String teacher) {
        this.courseId = courseCount;
        this.courseName = courseName;
        this.teacher = teacher;
        courseCount++;
    }
}
