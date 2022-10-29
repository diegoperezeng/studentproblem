package com.diegoperez.studentproblem.controller;

import com.diegoperez.studentproblem.model.Student;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Data
public class StudentController {

    ArrayList<Student> studentList = new ArrayList<Student>();

    public void saveStudent(@NotNull Integer id, @NotNull String name){
        Student student = new Student();
        student.setIdStudent(id);
        student.setStudentName(name);
        studentList.add(student);
    }

    //Method to show a student given an ID
    public String showStudentNameById(Integer id){
        for(Student a: studentList){
            if(a.getIdStudent() == id){return a.getStudentName();}

            for( int i=0; i>)
                else{return "Student not found";}
        }
    }
}
