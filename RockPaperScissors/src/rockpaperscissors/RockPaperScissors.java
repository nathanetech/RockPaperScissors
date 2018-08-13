package rockpaperscissors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author TechNathan
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        String playerName;
        int num = 0;

        Scanner input = new Scanner(System.in);

        Game RPS = new Game();

        RPS.promptNameChoice();
        playerName = input.next();

        Player User = new Player(playerName);
        Player Computer = new Player("Computer");

        while (RPS.checkLengthValidity(num) == false) {
            RPS.promptGameLength();
            num = input.nextInt();
        }

        for (int i = 0; i < num; i++) {
            String play = "";
            while (RPS.checkValidity(play) == false) {
                RPS.requestPlay();
                play = input.next();
            }
            
            RPS.interpretChoice(User, play);
            RPS.generateComputerChoice(Computer);

            RPS.determineWinner(User.value, Computer.value);
            RPS.scoreRound(User.value, Computer.value);

            RPS.displayResults(User, Computer);

        }
        
        RPS.end();
    }
}
