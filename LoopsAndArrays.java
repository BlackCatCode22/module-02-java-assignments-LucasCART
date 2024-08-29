// Lucas 8/29/24
/*
* LoopsAndArrays.java
*
* This program will use the for loop to loop through
* a lost of names stored in a string array.
*
*
*
*
*/
import java.util.Scanner;


public class LoopsAndArrays {
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Welcome to my Friendly For Loop Program\n");

        // Create a for loop that displays 'Hello There!' five times

        // The loop control variable of this for loop
        // is named i (it is means integer (whole number)).
        // This loop control variable must be: initialized, checked, and changed.
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is: " + i);
        }

        // Create a while loop that does the same thing.
        int loopControlVariable = 0;
        while (loopControlVariable < 10) {
            System.out.println("The value of loopControlVariable is: " + loopControlVariable);
            // Check the loop control variable.
            loopControlVariable++;
        }

        // Create a String array of 5 words.
        // String[] names = new String[10];
        String[] names = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        // Create an int array with 10 elements
        int[] myNumbers = new int[10];

        // Use a for loop to get 10 whole numbers from the user.
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter number " + (i+1));
            myNumbers[i] = scanner.nextInt();
        }

        // Output the myNumbers[] array ... with a for loop, using the length property
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of myNumbers[" + i + "] is: " + myNumbers[i]);
        }



        System.out.println("One one of our names is: " + names[4]);
        // Output the length of our array named name.
        System.out.println("\n The length of our array 'names' is: " + names.length);

        // Create a for loop that outputs all element values in the names array.
        for (int i = 0; i < 5; i++) {
            System.out.println("names[" + i + "] is... " + names[i]);
        }


        System.out.println("\n This is the end of our program!\n");

    }
}