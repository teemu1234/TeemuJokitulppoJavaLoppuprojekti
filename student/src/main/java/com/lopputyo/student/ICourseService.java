package com.lopputyo.student;
import java.util.List;

public interface ICourseService {

    List<Student> getStudents();

    List<Kurssi> getCourses();

    Student getStudentById(long studentId);

    Kurssi getCourseById(long courseId);

    List<Kurssi> getCoursesOfStudent(long studentId);

    boolean addStudentTOCourse(long studentId, long courseId);
}

