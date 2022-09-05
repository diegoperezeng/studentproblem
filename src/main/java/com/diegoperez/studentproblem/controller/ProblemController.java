package com.diegoperez.studentproblem.controller;

import com.diegoperez.studentproblem.model.ProblemItem;
import com.diegoperez.studentproblem.model.StudentSkill;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProblemController {



    public static String nextProblemName(@NotNull StudentSkill studentSkill, @NotNull ProblemItem problemItemList, Integer idStudent, Double limitScore){

        ArrayList<String> listProblemsCache = new ArrayList<String>();
        ArrayList<StudentSkill> listSkill = studentSkill.showStudentSkillLesser(idStudent, limitScore);

        for( int i = 0 ; i < listSkill.size() ; i++){
            ArrayList<ProblemItem> item = problemItemList.showProblemItemFiltered(listSkill.get(i).getStudentSkillName());
            for( int j = 0 ; j < item.size() ; j++) {
                listProblemsCache.add(j, item.get(j).getProblemName());
            }
        }

        Collections.shuffle(listProblemsCache);



        return listProblemsCache.get(0);

    }


}
