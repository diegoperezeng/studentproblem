package com.diegoperez.studentproblem.controller;

import com.diegoperez.studentproblem.model.ProblemItem;
import com.diegoperez.studentproblem.model.StudentSkill;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProblemController {


    //Method to show a random problem based on the skills under the limit score for a given student id
    public static String nextProblemName(@NotNull StudentSkill studentSkill, @NotNull ProblemItem problemItemList, Integer idStudent, Double limitScore){

        ArrayList<String> listProblemsCache = new ArrayList<String>();
        ArrayList<StudentSkill> listSkill = studentSkill.showStudentSkillLesser(idStudent, limitScore);
        String[] ops = new String[];
        Integer test = Integer.MIN_VALUE;
        ArrayList<String> opsList =Arrays.asList(ops);

        opsList.get()
                Integer.p



        for( int i = 0 ; i < listSkill.size() ; i++){
            ArrayList<ProblemItem> item = problemItemList.showProblemItemFiltered(listSkill.get(i).getStudentSkillName());
            for( int j = 0 ; j < ops.length ; j++) {
                listProblemsCache.add(j, item.get(j).getProblemName());
            }
        }

        Collections.shuffle(listProblemsCache);

        return listProblemsCache.get(0);

    }
}
