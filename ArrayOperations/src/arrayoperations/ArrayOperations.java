package arrayoperations;
/*
 * Michael Swanson
 * 10/7/16
 * Desc: Hella arrays
 */

import java.util.Random;

public class ArrayOperations {

    public static void main(String[] args) {
        int randomValue;//Declaring randomized number
        int counter;//Declaring counter
        int[] x = new int[10000];//Declaring Array

        for (counter = 0; counter < 10000; counter++) {//Loop that assigns random values to array x[0-999]
            Random rnd = new Random();//Initialzes random number
            randomValue = rnd.nextInt(201);//to randomValue
            x[counter] = randomValue;//Assigns array to a random value
        }//loops until counter = 10000
        System.out.println("||| Random Array Generated |||\n        Index : 10000\n        Range : 0 - 200\n");
        int sumArray = 0;//Declares variable for sum
        for (counter = 0; counter < x.length; counter++) {//Loops each array into sum
            sumArray += x[counter];
        }
        System.out.println("The sum of the array is : " + sumArray);//Prints results to output

        for (counter = 0; counter < x.length; counter++) {//Loops each array into sum
            sumArray += x[counter];
            double averageArray = (double) sumArray / 10000;//Declares double variable for average

            System.out.println("The average of the array is : " + averageArray);

            int maxArray = 0;//Declares max/ min variables
            int indexMax = 0;
            for (counter = 0; counter < x.length; counter++) {//Finds max by counting through the index
                if (maxArray < x[counter]) {//Assigns anything higher than max to max, maxArray starts at 0
                    maxArray = x[counter];
                    indexMax = counter;//Logs index of max
                }
            }
            System.out.println("The max of the array is : " + maxArray + ", at index : " + indexMax);//Prints results to output
            int minArray = 2000;//Repeats for min, reverses operators and minArray starts at 200
            int indexMin = 0;
            for (counter = 0; counter < x.length; counter++) {
                if (x[counter] < minArray) {
                    minArray = x[counter];
                    indexMin = counter;
                }
            }
            System.out.println("The min of the array is : " + minArray + ", at index : " + indexMin);//Prints results

            int evenArray = 0;//Declares variables for even/ odd, and the sum for both
            int oddArray = 0;
            int sumEven = 0;
            int sumOdd = 0;

            for (counter = 0; counter < x.length; counter++) {//Checks all index by counting to 10000
                if (0 == x[counter] % 2) {//Checks for even, if true
                    evenArray++;//Adds 1 to number of even indexes
                    sumEven += x[counter];//Adds to sum of even indexes
                }
            }
            for (counter = 0; counter < x.length; counter++) {//Checks all index by counting to 10000
                if (0 != x[counter] % 2) {//Checks for odd, if true
                    oddArray++;
                    sumOdd += x[counter];
                }
            }

            System.out.println("The sum of the even numbers is : " + sumEven);//Prints results to output
            System.out.println("The sum of the odd numbers is : " + sumOdd);
            System.out.println("The amount of even numbers in the array is : " + evenArray);
            System.out.println("The amount of odd numbers in the array is : " + oddArray);
        }
    }
}
