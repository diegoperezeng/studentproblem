package com.diegoperez.studentproblem.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.stream.Collectors;


@Data
public class ProblemItem {

    private Integer problemItemId;
    private String problemItemText;
    private String problemItemSkill;
    private Double problemItemSkillScore;
    private String problemName;

    public String toString() {
        return "Item: "  + this.problemItemText + " {" + this.problemItemSkill + "}";
    }

    public ProblemItem(Integer problemItemId, String problemItemText, String problemItemSkill, Double problemItemSkillScore, String problemName){
        this.problemItemId = problemItemId;
        this.problemItemText = problemItemText;
        this.problemItemSkill = problemItemSkill;
        this.problemItemSkillScore = problemItemSkillScore;
        this.problemName = problemName;
    }

    public ProblemItem(){
    }

    private ArrayList<ProblemItem> problemItem = new ArrayList<>();

    //Method to save an Item for a given problem name that are already in DB
    public void saveProblemItem(Integer problemItemId, String problemItemText, String problemItemSkill, Double problemItemSkillScore, String problemName){
        ProblemItem problemItems = new ProblemItem(problemItemId, problemItemText, problemItemSkill, problemItemSkillScore, problemName);
        if(problemItemId !=null && problemItemText !=null && problemItemSkill !=null && problemItemSkillScore !=null && problemName !=null  ){ problemItem.add(problemItems);}
    }

    //Method to show all Items for a given problem name that are already in DB
    public ArrayList<ProblemItem> showProblemItem(String problemName){
        ArrayList<ProblemItem> filteredProblemItem = (ArrayList<ProblemItem>) problemItem.stream().filter(item -> item.problemName.equals(problemName)).collect(Collectors.toList());
        return filteredProblemItem;
    }

    //Method to show all registered Items (that are already in DB) that have a specific skill for training, consider a given skill name
    public ArrayList<ProblemItem> showProblemItemFiltered(String problemItemSkill){
        ArrayList<ProblemItem> filteredProblemItem = (ArrayList<ProblemItem>) problemItem.stream().filter(item -> item.problemItemSkill.equals(problemItemSkill)).collect(Collectors.toList());
        return filteredProblemItem;
    }

}
