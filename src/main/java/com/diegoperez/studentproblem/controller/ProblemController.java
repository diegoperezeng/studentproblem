package com.diegoperez.studentproblem.controller;

import com.diegoperez.studentproblem.model.ProblemItem;
import com.diegoperez.studentproblem.model.StudentSkill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProblemController {

    private static ArrayList<StudentSkill> studentSkills = new ArrayList<>();

    public String nextProblemName(Integer idStudent,Double limitScore){

        StudentSkill studentSkill = new StudentSkill();
        ProblemItem problemItemList = new ProblemItem();

        List<String> listProblemsCache = null;
        ArrayList<StudentSkill> listSkill = studentSkill.showStudentSkillLesser(idStudent, limitScore);


        for( int i = 0 ; i < listSkill.size() ; i++){
            ArrayList<ProblemItem> item = problemItemList.showProblemItemFiltered(listSkill.get(i).getStudentSkillName());
            for( int j = 0 ; j < item.size() ; j++) {
                listProblemsCache.add(item.get(j).getProblemName());
            }
        }

        Collections.shuffle(listProblemsCache);



        return listProblemsCache.get(0);

    }


}
