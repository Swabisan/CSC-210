/*
 * Michael Swanson
 * 09/09/16
 * CSC 210-01
 * Calculate the BMI of the user
 */
package bmi.calculator;

import java.util.Scanner;

public class BMICalculator {

    /**
     * Description: Calculates BMI using user input.
     *
     * @param args
     */
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in); // creating scanner
        String Name; // declaring name
        Name = ""; // initializing name
        System.out.print("Enter name: "); // prompt for user input
        if (input.hasNextLine()) { // user's input becomes (String Name)
            Name = input.nextLine();
        }
        int height; // declaring height in inches
        height = 0; // initializing height
        System.out.print("Enter Height (inches) : "); // prompt for user input
        if (input.hasNextInt()) { // user's input becomes the variable height
            height = input.nextInt();
        } else { // error message & exit if user inputs wrong data type
            System.out.println("INVALID INPUT: Please express height as a whole number.");
            System.exit(0);
        }
        double weight; // declaring weight
        weight = 0; // initializing weight
        System.out.print("Enter Weight (pounds) : "); // prompt for user input
        if (input.hasNextDouble()) { // user's input becomes the variable weight
            weight = input.nextDouble();
        } else { // error message & exit if user inputs wrong data type
            System.out.println("INVALID INPUT: Please express weight as a number.");
            System.exit(0);
        }

        // Variables not inputted by user
        int HeightFeet; // declaring the variables required for the conversion
        int HeightInches; // of inches to feet, and for the calculation of the
        double BMIValue; // user's BMI

        // BMI calculation
        BMIValue = weight / Math.pow(height, 2) * 703; // BMI equation
        HeightFeet = height / 12; // convert inches to feet
        HeightInches = height % 12; // find the remainder of inches

        // Output/ Results
        System.out.println("_______________ \nBMI Results\n"); // title, to make output neater
        System.out.println("Name   : " + Name); // display user's name
        if (HeightInches == 0) { // clause that determines the nessisity of in
            System.out.println("Height : " + HeightFeet + " ft");
        } else {
            System.out.println("Height : " + HeightFeet + " ft, " + HeightInches + " in");
        }
        if (weight <= 1.0) { // clause the determines wether to plural "pound"
            System.out.println("Weight : " + weight + " lb");
        } else {
            System.out.println("Weight : " + weight + " lbs");
        }
        if (BMIValue < 18.5) { // series of clauses that determine which BMI
            System.out.println("BMI    : Underweight"); // Category to print
        } else if (BMIValue >= 18.5 && BMIValue < 25) { // to output
            System.out.println("BMI    : Normal Weight");
        } else if (BMIValue >= 25 && BMIValue < 30) {
            System.out.println("BMI    : Overweight");
        } else if (BMIValue >= 30) {
            System.out.println("BMI    : Obese");
        }
    }
}
