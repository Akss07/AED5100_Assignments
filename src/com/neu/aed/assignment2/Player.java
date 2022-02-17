package com.neu.aed.assignment2;

/**
 * Question 4 write an int compare (Player a, Player b) method implementing the Comparator. compare (T o1, T o2) method.
 * main class - PlayerMain
 */
public class Player{
    private String name;
    private int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    //getters and setters of the fields
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
