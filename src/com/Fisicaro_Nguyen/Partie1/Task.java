package com.Fisicaro_Nguyen.Partie1;

import java.util.ArrayList;
import java.util.Date;

public class Task {

    private String description;
    private int expectedDuration; // hours
    private Date deadline;
    private boolean progress;


    ArrayList<Skill> skills= new ArrayList<>();

    public Task(String description, int expectedDuration, Date deadline, boolean progress) {
        this.description = description;
        this.expectedDuration = expectedDuration;
        this.deadline = deadline;
        this.progress = progress;
    }

    public void addSkill(String nameSkill, int levelSkill){
        Skill skill = new Skill(nameSkill,levelSkill);
        skills.add(skill);
    }


    public String getDescription() {
        return description;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public Date getDeadline() {
        return deadline;
    }

    public boolean isProgress() {
        return progress;
    }
}
