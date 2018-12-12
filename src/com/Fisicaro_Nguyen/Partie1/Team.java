package com.Fisicaro_Nguyen.Partie1;



import java.util.ArrayList;

public class Team {
    private String Name_Team;
    private ArrayList<Worker> team;

    public Team(String name_Team, String Boss) {
        Name_Team = name_Team;
        team = new ArrayList<>();
    }

    public void addWorker(Worker worker){
        team.add(worker);
    }
}
