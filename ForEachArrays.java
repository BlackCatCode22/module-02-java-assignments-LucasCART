// Lucas 9/3/24
// ForEachArrays.java

public class ForEachArrays {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my For : Each practice program!\n");

        // Create an array of cars. Do this two different ways and be able to explain to your lab partner.

        // Create a cars[] array using initialization
        String[] cars = {"BMW", "Tesla", "Honda"};

        // Output the cars array using a for each loop.
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n My for loop is done.");

        // Use a for : each loop to do the same thing.
        for (String car : cars) {
            System.out.println(car);
        }

        // Create a String array using the new operator.
        // Create a 4 element String array named myCars.
        String[] myCars = new String[4];

        // myCars[0], myCars[1], myCars[2], myCars[3]

        // Fill the newly created String[] array with data.
        myCars[0] = "Tesla";
        myCars[1] = "GMC";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        // Use a for : each loop to output the myCars[] array.
        for (String myCar : myCars) {
            System.out.println("\n A car in myCars[] array is : " + myCar);
        }

        String[] myStrings = new String[60000];

        /*

        // Use a for loop to fill the array with some strings
        for (int i = 0; i < 600; i++) {
            // fill my array with strings
            myStrings[i] = "this is string number: " + (i + 1);
        }

         */

        int aNum = 0;
        for (String aStr : myStrings) {
            // fill my array with strings
            myStrings[aNum] = "this is string number: " + (aNum + 1);
            aNum++;
        }

        // Now... use a for : each loop to output the myStrings[] array.
        for (String aStr : myStrings) {
            System.out.println("An element in myStrings[] is " + aStr);
        }

        // Let's reverse a string.
        String myStrToReverse = "abcdefg";

        // Output the chars of myStrToReverse
        for (int i = 0; i < 7; i++) {
            System.out.println("myStrToReverse[" + i + "] is: " + myStrToReverse.charAt(i));
        }
        System.out.println("End of initial output.");

        // Create the reverse string.
        String reversedStr = "";
        // Output reversedStr.
        System.out.println("reversedStr before reversion loop is: " + reversedStr);

        for (int i = 6; i >= 0; i--) {
            char charToAdd = myStrToReverse.charAt(i);
            reversedStr = reversedStr.concat(Character.toString(charToAdd));
        }
        // Output reversedStr.
        System.out.println("reversedStr after reversion loop is: " + reversedStr);


    }
}