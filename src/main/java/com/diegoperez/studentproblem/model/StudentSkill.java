package com.diegoperez.studentproblem.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Data
public class StudentSkill {

    private Integer studentSkillId;
    private Integer idStudent;
    private String studentSkillName;
    private Double studentSkillScore;

    public String toString() {
        return "Skill " + this.studentSkillId + ":"  + this.studentSkillName + "/Skill Score:" + this.studentSkillScore;
    }

    public StudentSkill(Integer idStudent, Integer studentSkillId, String studentSkillName, Double studentSkillScore){
        this.idStudent = idStudent;
        this.studentSkillId = studentSkillId;
        this.studentSkillName = studentSkillName;
        this.studentSkillScore = studentSkillScore;
    }


    public StudentSkill(){
    }
    private ArrayList<StudentSkill> studentSkills = new ArrayList<>();

    //Method to save a student's skill
    public void saveStudentSkill(Integer idStudent, Integer studentSkillId, String studentSkillName, Double studentSkillScore){
        StudentSkill studentSkill = new StudentSkill(idStudent, studentSkillId, studentSkillName, studentSkillScore);
        if(studentSkillName !=null && idStudent !=null && studentSkillName !=null && studentSkillScore !=null ){ studentSkills.add(studentSkill);}
    }

    //Method to show the student's skills
    public ArrayList<StudentSkill> showStudentSkill(Integer idStudent){
        ArrayList<StudentSkill> filteredSkill = (ArrayList<StudentSkill>) studentSkills.stream().filter(item -> item.idStudent.equals(idStudent)).collect(Collectors.toList());
        return filteredSkill;
    }

    //Method to show the student's skills that are under the score limitation
    public ArrayList<StudentSkill> showStudentSkillLesser(Integer idStudent,Double limitScore) {
        ArrayList<StudentSkill> filteredMinorSkills = (ArrayList<StudentSkill>) studentSkills.stream().filter(item -> item.idStudent.equals(idStudent)).filter(item -> item.studentSkillScore.compareTo(limitScore) < 0).collect(Collectors.toList());
        return filteredMinorSkills;
    }

}