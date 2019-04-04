

//Create an input validation class
//
//Create directory inside of src named util. Inside of util, create a class named Input that has a private
// property named scanner. When an instance of this object is created, the scanner property should be set to
// a new instance of the Scanner class. The class should have the following methods, all of which return command
// line input from the user:
//
//        String getString()
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//        The getInt(int min, int max) method should keep prompting the user for input until they give an integer
//        within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//        Create another class named InputTest that has a static main method that uses all of the methods from the Input class.

package util;

import java.util.Locale;
import java.util.Scanner;


public class Input {

    //private property
    private Scanner scanner;

    //new instance of the scanner class (constructor)

    public Input() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    }


    //First Method
    public String getString() {
        String userInput = scanner.next();
        scanner.nextLine();
        return userInput;


    }

    public Boolean yesNo() {
        String result = scanner.next();

        if (result.equals("Yes") || result.equals("Y")) {
            return true;
        } else {
            return false;
        }

    }


    public int getInt(int min, int max) {


        Integer userInt;
        String input = scanner.nextLine();
        try {
            userInt = Integer.valueOf(input);
        } catch (NumberFormatException nfe) {
            System.out.println("input a number: ");
            return getInt(min, max);
        }
        if (userInt >= min && userInt <= max) {
            return userInt;
        }

        System.out.println("Input out of bounds, try again: ");
        return getInt(min, max);
    }


    public int getInt() {
        int i = 0;
        String input = scanner.next();
        try {
            i = Integer.valueOf(input);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong format, please type in a number.");
            i = getInt();
        }
        return i;
    }


    public double getDouble(double min, double max) {


        Double userDouble;
        String input = scanner.nextLine();
        try {
            userDouble = Double.valueOf(input);
        } catch (NumberFormatException nfe) {
            System.out.println("input a number: ");
            return getDouble(min, max);
        }
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }

        System.out.println("Input out of bounds, try again: ");
        return getDouble(min, max);


    }

    public double getDouble() {
        double i = 0;
        String input = scanner.next();
        try {
            i = Double.valueOf(input);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong format, please type in a number");
            i = getDouble();
        }
        return i;
    }

}



