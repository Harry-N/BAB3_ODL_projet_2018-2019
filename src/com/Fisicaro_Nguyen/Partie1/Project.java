package com.Fisicaro_Nguyen.Partie1;

import java.util.ArrayList;
import java.util.Date;

public class Project {

    private String Name_Project;
    private String Lieu;
    private Date date;

    private ArrayList<Task> Tasks;

    public Project(String name_Project, String lieu, Date date) {
        Name_Project = name_Project;
        Lieu = lieu;
        this.date = date;

        Tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        Tasks.add(task);
    }



    public String getName_Project() {
        return Name_Project;
    }

    public String getLieu() {
        return Lieu;
    }

    public Date getDate() {
        return date;
    }
}
