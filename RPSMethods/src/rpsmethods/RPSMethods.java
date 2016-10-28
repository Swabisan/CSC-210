/*
 * Michael Swanson
 * Assignment 7 - RPS Methods - 10/26/2016
 * Refactor assignment 4 (Rock Paper scissors) to include multiple methods.
 */
package rpsmethods;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Michael Swanson
 */
public class RPSMethods {

    public static void main(String[] args) {
        GreetingMessage();

        int inputUser;                                                          // declaring buttload of variables
        int inputComp;
        int result;
        int scoreUser = 0;                                                      // while initializing a couple
        int scoreComp = 0;

        do {                                                                    // repeats game until best of three
            do {                                                                // repeats game if tie
                inputUser = GetUserInput();
                inputComp = GetCompInput();
                result = DetermineWinner(inputUser, inputComp);
            } while (result == 0);

            if (result == 1) {                                                  // tracks score
                scoreUser++;
            } else if (result == 2) {
                scoreComp++;
            }
        } while (scoreUser < 2 && scoreComp < 2);

        if (scoreUser == 2) {                                                   // determines winner
            System.out.println("You won best two out of three!");
        } else {
            System.out.println("Computer won best two out of three! Game over.");
        }
    }

    public static void GreetingMessage() {
        System.out.println("Welcome to Rock Paper Scissors!");                  // welcome splash
    }

    public static int GetUserInput() {
        Scanner input = new Scanner(System.in);                                 // activates scanner & related variables
        int inputUser = 0;
        boolean errorCheck = true;
        do {
            System.out.print("Enter scissor (0), rock (1), paper (2); ");       // * retreives user input, if user inputs a valid integer, loop is broken
            if (input.hasNextInt()) {
                inputUser = input.nextInt();
                if (inputUser >= 0 && inputUser <= 2) {
                    errorCheck = false;
                } else {
                    System.out.println("Invalid Range.\n");
                    input.nextLine();
                }
            } else {
                System.out.println("Invalid Data Type.\n");
                input.nextLine();
            }
        } while (errorCheck);                                                   // "user is a potato" condition
        return inputUser;                                                       // ** if user breaks loop, returns user's input
    }

    public static int GetCompInput() {                                          // creates & returns random integer from 0 -2
        int inputComp;
        Random rnd = new Random();
        inputComp = rnd.nextInt(3);
        return inputComp;
    }

    public static int DetermineWinner(int inputUser, int inputComp) {           // determines who wins and then returns a signal as to who won
        int result;
        String choiceUser = "";
        String choiceComp = "";
        
        switch (inputUser){                                                     // silly switches to turn numbers into words
            case 0:
                choiceUser = "scissors";
                break;
            case 1:
                choiceUser = "rock";
                break;
            case 2:
                choiceUser = "paper";
                break;
        }
        
        switch (inputComp){
            case 0:
                choiceComp = "scissors";
                break;
            case 1:
                choiceComp = "rock";
                break;
            case 2:
                choiceComp = "paper";
                break;
        }
        
        if (inputUser == inputComp) {                                           // prints out user and comp choices as well as the winner of each round
            System.out.println("The computer is " + choiceComp + ". You are " + 
                    choiceUser + ". Tie game!\n");
            result = 0;
            return result;
        } else if (inputUser == 0 && inputComp == 2 || inputUser > inputComp) {
            System.out.println("The computer is " + choiceComp + ". You are " + 
                    choiceUser + ". You win!\n");
            result = 1;
            return result;
        } else {
            System.out.println("The computer is " + choiceComp + ". You are " + 
                    choiceUser + ". Computer wins!\n");
            result = 2;
            return result;
        }
    }
}
