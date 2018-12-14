package com.Fisicaro_Nguyen.Partie1;

import java.util.ArrayList;

public class Worker  {
    private String Name;
    protected String Role;

    ArrayList<Skill>skills= new ArrayList<>();


    public Worker(String name) {
        Name = name;
        Role="Worker";
    }

    public String getName(){
        return Name;
    };

    public String getRole(){
        return Role;
    };

    public String toString() {
        return "Name: " + Name + " Role: " + Role + "\n";
    };


    public void addSkill(String nameSkill, int levelSkill){
        Skill skill = new Skill(nameSkill,levelSkill);
        skills.add(skill);
    }

    public void changeSkillLevel (Skill skill, int newlevel){

        skills.get(skills.indexOf(skill)).setLevel(newlevel);


    }

}
