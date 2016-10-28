/*
 * Michael Swanson
 * 9/18/16
 * CSC 210-01
 * Game of Rock-Paper-Scissors
 */
package rps;

import java.util.Random; //Random number generator
import java.util.Scanner; //User input

public class RPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int playerScore = 0; //Number of player victories
        int computerScore = 0; //Number of computer victories
        int roundValue = 1; //Counts the round
        boolean userCheck = true;
        System.out.println("Welcome to Rock Paper Scissors!"); //Splash message
        for (; playerScore < 2 && computerScore < 2;) { //Win condition
            System.out.println("Round " + roundValue + "!"); //Increases by 1 every round
            Random rnd = new Random(); //Activates random class
            int computerValue = rnd.nextInt(3); //Assigns variable to a random integer between 0 & 2
            Scanner input = new Scanner(System.in); //Activates scanner class
            int userValue = 0;
            while (userCheck) { //Loop that repeats until user inputs valid entry (Integer between 0 & 2)

                System.out.print("Enter scissor (0), rock (1), paper (2); "); //Prompt user input/ choice (Correlates to rock, paper, or scissors)
                if (input.hasNextInt()) {
                    userValue = input.nextInt(); //Assigns user input to variable userValue
                    if (userValue >= 0 && userValue <= 2) { //Clause that determines if the user inputs a value between 0 & 2
                        userCheck = false; //Breaks loop
                    } else {
                        System.out.println("INVALID INPUT: Please enter a whole number between 0 and 2\n\n|||Try again|||\n"); //Else error message and restarts loop
                    }
                } else {
                    System.out.println("INVALID INPUT: Please enter a whole number between 0 and 2\n\n|||Try again|||\n"); //Determines if user enters correct data type, if not, warning message and restarts loop
                    input.nextLine();
                }
            }
            userCheck = true; //Resets loop
            String computerChoice = ""; //String version of computerValue
            switch (computerValue) { //Converts (0, 1, & 2) to (scissors, rock, and paper)
                case 0:
                    computerChoice = "scissors";
                    break;
                case 1:
                    computerChoice = "rock";
                    break;
                case 2:
                    computerChoice = "paper";
                    break;
            }
            String userChoice = ""; //String version of userValue
            switch (userValue) { //Converts (0, 1, & 2) to (scissors, rock, and paper)
                case 0:
                    userChoice = "scissors";
                    break;
                case 1:
                    userChoice = "rock";
                    break;
                case 2:
                    userChoice = "paper";
                    break;
            }
            if (userValue == computerValue) { //Clause that determines if there is a tie
                System.out.println("The computer is " + computerChoice + ". You are " + userChoice + " too. Game is a draw.");
            } else if (userValue > computerValue || userValue == 0 && computerValue == 2) { //Determines win condition of a round
                System.out.println("The computer is " + computerChoice + ". You are " + userChoice + ". You won!");
                playerScore++; //Adds 1 to player score
            } else { //Lose condition
                System.out.println("The computer is " + computerChoice + ". You are " + userChoice + ". Computer wins.");
                computerScore++; //Adds 1 to computer score
            }
            roundValue++; //Adds 1 for the next round
        }
        if (computerScore == 2) { //Determines if computer wins series
            System.out.println("Computer wins best out of three!");
        } else if (playerScore == 2) { //Determines if user wins series
            System.out.println("You win best out of three!");
        }
    }
}
