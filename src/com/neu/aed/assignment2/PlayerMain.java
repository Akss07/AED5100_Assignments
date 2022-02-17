package com.neu.aed.assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerMain {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("John",20));
        players.add(new Player("Tom",5));
        players.add(new Player("Greg",10));
        players.add(new Player("Lilly",8));
        players.add(new Player("Andrew",10));
        players.add(new Player("Karen",50));

        //anonymous class
        Comparator<Player> playerComparator = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                if(p1.getScore() > p2.getScore()){
                    return -1;
                }else if(p1.getScore() < p2.getScore()){
                    return 1;
                }else{
                    return p2.getName().compareTo(p1.getName());
                }
            }
        };

        Collections.sort(players, playerComparator);
        System.out.println(players.toString());
    }
}

