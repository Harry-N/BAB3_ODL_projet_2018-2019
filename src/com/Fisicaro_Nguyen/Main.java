package com.Fisicaro_Nguyen;


import com.Fisicaro_Nguyen.Partie1.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Worker>workers=new ArrayList<>();
        ArrayList<Team>Teams=new ArrayList<>();

        int NbrWorkers=10;
        int NbrChefs=2;

        Manager manager = new Manager("Boss");


        for (int i = 0; i<NbrWorkers; i++){

            //Scanner S=new Scanner(System.in);
            //String nom=S.next();

            String nom = "Worker"+(i+1);

            Worker temp= new Worker(nom);
            workers.add(temp);
        }
        System.out.println(workers);


        for (int j= 0; j<NbrChefs; j++){

            String NomTeam = "Team"+(j+1);
            String NomChef = "Chef"+(j+1);

            Chef temp1 = new Chef(NomChef);
            Team temp2 = new Team(NomTeam,temp1);

            Teams.add(temp2);
        }
        System.out.println(Teams);

        for (Team team: Teams){
            //for (Iterator<Worker> it = workers.iterator(); it.equals(NbrWorkers/NbrChefs); it.hasNext()){
            for (int k=0; k<NbrWorkers/NbrChefs;k++){
                team.addWorker(workers.get(k));
            }
        }
        System.out.println(Teams.get(0).getTeam());
        System.out.println(Teams.get(1).getTeam());

        /*
        Worker Federico = new Worker("Fede");
        Chef Harry = new Chef("Harry");
        String a;
        a=System.in.toString();
        System.out.println(Harry.getRole());
        System.out.println(Harry.getName());
        System.out.println(Federico.getRole());
        System.out.println(Federico.getName());
        */
    }
}
