/*
 * Michael Swanson
 * 9/26/2016
 * CSC 210
 * A whole bunch of motherfucking loops!
 */
package loops;

public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------- LOOP 1 ----------");//Loop 1. Counts 0-110 in even numbers
        int i = 0;//Declare variable
        for (; i <= 110; i += 2) {//Limit set 110, adds by 2
            System.out.println(i);//Prints every loop
        }
        System.out.println("---------- LOOP 2 ----------");//Starts at 100, halves itself until 0
        i = 200;//Starts at 200 because println is after first cycle.
        while (i > 0) {//Stops at 0
            i = i / 2;//Divides i in half every cycle
            System.out.println(i);//Prints after every division
        }
        System.out.println("---------- LOOP 3 ----------");//Calculates 2^15 using a do-while loop
        i = 2;//Resets i
        int x = 0;//Declares second variable, x will be a "ticker" that coutns to 15
        do {
            System.out.println(i);//Prints at the begining of every cycle
            i *= 2;//Multiplies by 2 every cycle
            x++;//Counter
        } while (x < 15);//Counter stops at 14, (0 - 14)
        System.out.println("---------- LOOP 4 ----------");//Counts from 100-250, prints multiples of 4 & 3
        for (i = 100; i <= 250; i++) {//i starts at 100, ends at 250, add 1 every cycle
            if (i % 12 == 0) {//Every multiple of 4 & 3 is a factor of 12
                System.out.println(i);//Prints every multiple of 12
            }
        }
        System.out.println("---------- LOOP 5 ----------");//Counts 150, prints every factor of 9
        i = 0;//Resets variable to 0
        while (i <= 150) {//Ends at 150
            if (i % 9 == 0) {//Every factor of 9 is mod = to 0
                System.out.println(i);//Prints every cycle
            }
            i++;//Add 1 to counter
        }
        System.out.println("---------- LOOP 6 ----------");//Calculates x^30
        x = 1;//Resets variable to 1
        for (i = 0; i <= 30; i++) {//Counter "i" starts @ 0, ends @ 30, adds 1 every cycle
            System.out.println(x);//Prints at the beggining of every cycle
            x *= 2;//Multiplies by 2 every cycle
        }
        System.out.println("---------- LOOP 7 ----------");//Calculates the sum of a series from 1/1-1/5000
        x = 1;//resets variable to 1
        double n = 1;//Declares and initiates double n to 1, double is requred for floating point numbers
        do {
            n = n + (1 / (double) x);//Adds 1/x to n every cycle
            x++;//Adds 1 to x every cycle
        } while (x <= 5000);//Cycle ends when x = 5001
        System.out.println(n);//Prints final result
        System.out.println("---------- LOOP 8 ----------");//Reverse int 57437
        x = 0;//Resets variable to 0
        i = 738475;//738475
        while (i != 0) {//Cycle ends when i = 0
            /*
             * To reverse an int you need to take mod 10 of the number in
             * question and add it to the reversed number * 10, then divide
             * the initial number by 10 and repeat until initial number = 0
             */
            x = x * 10 + i % 10;
            i /= 10;//Removes the right most digit of i
        }
        System.out.println(x);//Prints result

    }
}
