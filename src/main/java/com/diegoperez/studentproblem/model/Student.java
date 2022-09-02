package com.diegoperez.studentproblem.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Data
public class Student {

    private Integer idStudent;
    private String studentName;

    public String toString() {
        return "Student ID: " + this.idStudent + ", Student Name: "  + this.studentName;
    }

    public Student(Integer IdStudent, String studentName){
        this.idStudent = IdStudent;
        this.studentName = studentName;
    }

    public Student() {
    }
    private ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Integer idStudent, String studentName){
        Student student = new Student(idStudent, studentName);
        if(studentName !=null && idStudent !=null){ studentList.add(student);}
    }

    public ArrayList<Student> showStudent(Integer idStudent){
        ArrayList<Student> filteredStudent = (ArrayList<Student>) studentList.stream().filter(item -> item.idStudent.equals(idStudent)).collect(Collectors.toList());
        return filteredStudent;
    }
}