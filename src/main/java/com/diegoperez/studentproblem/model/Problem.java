package com.diegoperez.studentproblem.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Data
public class Problem {
    private String problemName;
    private String problemHeader;

    public String toString() {
        return "Problem " + this.problemName + ": "  + this.problemHeader;
    }

    public Problem(String problemName, String problemHeader){
        this.problemName = problemName;
        this.problemHeader = problemHeader;
    }

    public Problem() {
    }
    private ArrayList<Problem> problemList = new ArrayList<>();

    public void saveProblem(String problemName, String problemHeader){
        Problem problem = new Problem(problemName, problemHeader);
        if(problemName !=null && problemHeader !=null){ problemList.add(problem);}
    }

    public ArrayList<Problem> showProblem(String problemName){
        ArrayList<Problem> filteredProblem = (ArrayList<Problem>) problemList.stream().filter(item -> item.problemName.equals(problemName)).collect(Collectors.toList());
        return filteredProblem;
    }
}
