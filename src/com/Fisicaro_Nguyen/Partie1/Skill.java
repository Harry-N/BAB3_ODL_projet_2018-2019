package com.Fisicaro_Nguyen.Partie1;

public class Skill {
    private int level;
    private String name;

    public Skill(String name, int level) {
        if(level <0){
            this.level = 0;
        } else {
            if(level >2){
                this.level=2;
            }else {
                this.level=level;
            }
        }
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}