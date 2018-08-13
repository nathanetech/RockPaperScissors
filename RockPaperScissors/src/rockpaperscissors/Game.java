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
public class Game {

    private int p1Score = 0;
    private int p2Score = 0;
    private int tie = 0;

    Game() {
        this.p1Score = 0;
        this.p2Score = 0;
        this.tie = 0;
    }

    public void promptNameChoice() {
        System.out.print("Choose name for your player: ");
    }

    public void promptGameLength() {
        System.out.print("Play to Best Of: ");
    }

    public void requestPlay() {
        System.out.print("Choose rock (r), paper (p), or scissors (s): ");
    }
    
    public boolean checkLengthValidity(int num) {
        boolean lengthCheck = false;
        
        if (num > 0)
            lengthCheck = true;
        else
            lengthCheck = false;
        
        return lengthCheck;
    }

    public boolean checkValidity(String a) {
        boolean check = false;

        if ("r".equals(a) || "p".equals(a) || "s".equals(a)) {
            check = true;
        } else {
            check = false;
        }

        return check;
    }

    public void interpretChoice(Player A, String a) {
        if ("r".equals(a)) {
            A.playRock();
        } else if ("p".equals(a)) {
            A.playPaper();
        } else if ("s".equals(a)) {
            A.playScissors();
        }
    }

    public void generateComputerChoice(Player B) {
        int num = (int) (Math.random() * 3);

        if (num == 0) {
            B.playRock();
        } else if (num == 1) {
            B.playPaper();
        } else if (num == 2) {
            B.playScissors();
        }
    }

    public int determineWinner(int p1, int p2) {
        int win = 0;

        if (p1 == 0 && p2 == 0) {
            win = 2;
        } else if (p1 == 0 && p2 == 1) {
            win = 1;
        } else if (p1 == 0 && p2 == 2) {
            win = 0;
        } else if (p1 == 1 && p2 == 0) {
            win = 0;
        } else if (p1 == 1 && p2 == 1) {
            win = 2;
        } else if (p1 == 1 && p2 == 2) {
            win = 1;
        } else if (p1 == 2 && p2 == 0) {
            win = 1;
        } else if (p1 == 2 && p2 == 1) {
            win = 0;
        } else if (p1 == 2 && p2 == 2) {
            win = 2;
        }

        return win;
    }

    public void scoreRound(int p1, int p2) {
        if (determineWinner(p1, p2) == 0) {
            p1Score++;
        } else if (determineWinner(p1, p2) == 1) {
            p2Score++;
        } else if (determineWinner(p1, p2) == 2) {
            tie++;
        }
    }

    public void displayResults(Player A, Player B) {

        System.out.println(A.name + " played " + A.choice + " and "
                + B.name + " played " + B.choice + " \n" + A.name
                + ": " + p1Score + " \n" + B.name + ": " + p2Score + " \n"
                + "Tie: " + tie);
    }
    
    public void end() {
        if (p1Score > p2Score)
            System.out.println("\nYOU WIN");
        else if (p1Score < p2Score) 
            System.out.println("\nYOU LOSE");
        else
            System.out.println("\nTIE");
    }
}
