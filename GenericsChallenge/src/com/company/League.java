package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{

    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T Team){
        if (league.contains(Team)) {
            System.out.println(Team.getName() + " is already in this league");
            return false;
        } else {
            league.add(Team);
            System.out.println(Team.getName() + " picked for league " + this.name);
            return true;
        }
    }

    public void printLeague(){
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}