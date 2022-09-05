package com.diegoperez.studentproblem;

import com.diegoperez.studentproblem.controller.ProblemController;
import com.diegoperez.studentproblem.model.Problem;
import com.diegoperez.studentproblem.model.ProblemItem;
import com.diegoperez.studentproblem.model.Student;
import com.diegoperez.studentproblem.model.StudentSkill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.diegoperez.studentproblem.view.InterfaceFillSimulation;

@SpringBootApplication
public class StudentProblemApplication {
	public static void main(String[] args) {SpringApplication.run(StudentProblemApplication.class, args);

		//Now we call the data fill simulation, since there's no interface.
		Student studentList = InterfaceFillSimulation.FillStudentData();
		StudentSkill studentSkillList = InterfaceFillSimulation.FillSkillData();
		ProblemItem problemItemList = InterfaceFillSimulation.FillProblemItemData();
		Problem problemList = InterfaceFillSimulation.FillProblemData();



		//ID of the student for running the program:
		Integer writeStudentId = 2;
		//Score Limit for running the program:
		Double limitScore = 0.95;

		String writeProblemName = ProblemController.nextProblemName(studentSkillList, problemItemList, writeStudentId , limitScore );


		System.out.println("");
		System.out.println("");
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");
		System.out.println(studentList.showStudent(writeStudentId));
		System.out.println(studentSkillList.showStudentSkill(writeStudentId));
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");
		System.out.println(studentSkillList.showStudentSkillLesser(writeStudentId,limitScore));
		System.out.println(problemList.showProblem(writeProblemName));
		System.out.println(problemItemList.showProblemItem(writeProblemName));
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");
	}
}

