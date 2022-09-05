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
		//Pick a random problem that contains a skill that has to be trained by the student, due to the score limit:
		String writeProblemName = ProblemController.nextProblemName(studentSkillList, problemItemList, writeStudentId , limitScore );


		System.out.println("");
		System.out.println("");
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");

		//Showing the student profile data
		System.out.println(studentList.showStudent(writeStudentId));
		//Showing the student's Skills profile data
		System.out.println(studentSkillList.showStudentSkill(writeStudentId));

		System.out.println("***");
		System.out.println("***");
		System.out.println("***");

		//Showing the student's skills that are under the score limitation
		System.out.println(studentSkillList.showStudentSkillLesser(writeStudentId,limitScore));
		//Showing the random problem name and header
		System.out.println(problemList.showProblem(writeProblemName));
		//Showing the listed problem items
		System.out.println(problemItemList.showProblemItem(writeProblemName));

		System.out.println("***");
		System.out.println("***");
		System.out.println("***");
	}
}

