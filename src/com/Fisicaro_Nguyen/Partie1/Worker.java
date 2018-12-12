package com.Fisicaro_Nguyen.Partie1;

public class Worker  {
    private String Name, Role;

    public Worker(String name, String role) {
        Name = name;
        Role = role;
    }

    public String getName(){
        return Name;
    };

    public String getRole(){
        return Role;
    };

    public String toString() {
        return "Name :" + Name + "Role :" + Role;
    };
}
