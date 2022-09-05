package com.diegoperez.studentproblem.view;

import com.diegoperez.studentproblem.model.Problem;
import com.diegoperez.studentproblem.model.ProblemItem;
import com.diegoperez.studentproblem.model.Student;
import com.diegoperez.studentproblem.model.StudentSkill;

//Since there's no interface, we use this class to fill the DS as a mock

public class InterfaceFillSimulation {

    public static Student FillStudentData() {

        //Initiate students instance
        Student studentList = new Student();

        //Adding the StudentNumber_1:
        studentList.saveStudent(1,"Anakin");

        //Adding the StudentNumber_2:
        studentList.saveStudent(2,"Ahsoka");


        //Adding the StudentNumber_3:
        studentList.saveStudent(3,"Obi-Wan");

        return studentList;

    }

    public static StudentSkill FillSkillData() {
        //Initiate skill instance
        StudentSkill studentSkill = new StudentSkill();

        //Adding StudentNumber_1's skills:
        studentSkill.saveStudentSkill(1, 1, "add-decimals", 0.97);
        studentSkill.saveStudentSkill(1, 3, "add-fractions", 0.17);
        studentSkill.saveStudentSkill(1, 4, "multiply-fractions", 0.53);

        //Adding StudentNumber_2's skills:
        studentSkill.saveStudentSkill(2, 1, "add-decimals", 0.33);
        studentSkill.saveStudentSkill(2, 2, "multiply-decimals", 0.47);
        studentSkill.saveStudentSkill(2, 3, "add-fractions", 0.96);
        studentSkill.saveStudentSkill(2, 4, "multiply-fractions", 0.81);

        //Adding StudentNumber_3's skills:
        studentSkill.saveStudentSkill(3, 3, "add-fractions", 0.23);

        return studentSkill;
    }

    public static Problem FillProblemData(){
        Problem problem = new Problem();
        problem.saveProblem("prob1", "Solve this Problem 1");
        problem.saveProblem("prob2", "Solve this Problem 2");
        problem.saveProblem("prob3", "Solve this Problem 3");
        problem.saveProblem("prob4", "Solve this Problem 4");
        problem.saveProblem("prob5", "Solve this Problem 5");
        problem.saveProblem("prob6", "Solve this Problem 6");

        return problem;
    }
    public static ProblemItem FillProblemItemData() {
        //Initiate ProblemItem instance
        ProblemItem problemItem = new ProblemItem();

        //Adding Problem_1's items:
        problemItem.saveProblemItem(1, "texto a", "add-decimals", 1.00,"prob1");

        //Adding Problem_2's items:
        problemItem.saveProblemItem(2, "texto a", "add-decimals", 1.00,"prob2");
        problemItem.saveProblemItem(3, "texto b", "multiply-decimals", 1.00,"prob2");

        //Adding Problem_3's items:
        problemItem.saveProblemItem(4, "texto a", "add-fractions", 1.00,"prob3");

        //Adding Problem_4's items:
        problemItem.saveProblemItem(5, "texto a", "add-fractions", 1.00,"prob4");
        problemItem.saveProblemItem(6, "texto b", "multiply-fractions", 1.00,"prob4");

        //Adding Problem_5's items:
        problemItem.saveProblemItem(7, "texto a", "multiply-decimals", 1.00,"prob5");
        problemItem.saveProblemItem(8, "texto b", "multiply-fractions", 1.00,"prob5");

        //Adding Problem_6's items:
        problemItem.saveProblemItem(9, "texto a", "add-fractions", 1.00,"prob6");
        problemItem.saveProblemItem(10, "texto b", "add-decimals", 1.00,"prob6");

        return problemItem;
    }
}
