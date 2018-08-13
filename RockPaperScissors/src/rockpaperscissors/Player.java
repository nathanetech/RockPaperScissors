package rockpaperscissors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TechNathan
 */
public class Player {
    String name = "";
    String choice;
    int value;
    
    Player(String pName) {
        name = pName;
        choice = "";
        value = 0;
    }
    
    public int playRock() {
        this.choice = "ROCK";
        this.value = 0;
        return value;
    }
    
    public int playPaper() {
        this.choice = "PAPER";
        this.value = 1;
        return value;
    }
    
    public int playScissors() {
        this.choice = "SCISSORS";
        this.value = 2;
        return value;
    }
}
