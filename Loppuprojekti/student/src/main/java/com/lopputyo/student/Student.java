package com.lopputyo.student;

public class Student {
    private long studentId;
    private String fname;
    private String lname;

    public long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname; }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
}
    @Override
    public String toString() {
        return getFname() + getLname();
    };
}

