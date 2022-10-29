package com.diegoperez.studentproblem.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Data //That annotation have all the needed implementations
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

    public static void saveAll(Student student){
        this.idStudent = student.getIdStudent();
        this.studentName = student.getStudentName();
    }


    //Method to save a student

}