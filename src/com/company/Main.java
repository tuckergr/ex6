package com.company;

import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userInt;
    }

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userDouble;
    }

    public String promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = "";
        boolean isString = false;
        while (!isString) {
            try {
                int a = Integer.parseInt(userInput);
                double b = Double.parseDouble(userInput);
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            } catch (Exception e) {
                isString = true;
                System.out.println("Your string is valid.");
            }
        }
        return userString;
    }
}


public class Main {
    public static void main(String[] args) {
        UserInput IntInput = new UserInput();
        int aNumber = IntInput.promptInt("Enter an integer.");
        System.out.println("Your integer is valid");

        UserInput DoubleInput = new UserInput();
        double bNumber = DoubleInput.promptDouble("Enter a double.");
        System.out.println("Your double is valid");

        UserInput StringInput = new UserInput();
        String cNumber = StringInput.promptString("Enter a string.");
    }
}