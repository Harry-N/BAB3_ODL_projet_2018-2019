package com.Fisicaro_Nguyen.Partie1;



import java.util.ArrayList;

public class Team {
    private String Name_Team;
    private ArrayList<Worker> team;
    private Chef chef;

    public Team(String name_Team, Chef chef) {
        Name_Team = name_Team;
        team = new ArrayList<>();
        team.add(this.chef=chef);
    }

    public void addWorker(Worker worker){
        team.add(worker);
    }


    public String getName_Team() {
        return Name_Team;
    }

    public ArrayList<Worker> getTeam() {
        return team;
    }

    public Chef getChef() {
        return chef;
    }

    public String toString() {
        return "Name_Team: " + Name_Team + " Chef_Team: " + chef.getName() + "\n";
    };
}

