package org.fasttrackit;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String correctPassword = "Java123";
        String enteredPassword;
        String correctUsername = "a@a.com";
        String enteredUsername;
        int counter = 0;
        final int MAX_ATTEMPTS = 3;

        do {
            if (counter > 0) {
                System.out.println("Wrong username or password. You have " + (MAX_ATTEMPTS - counter) + " tries left");
            }

            enteredUsername = getInput("username");
            enteredPassword = getInput("password");
            counter++;

            if (enteredPassword.equals(correctPassword) && enteredUsername.equals(correctUsername)) {
                System.out.println("Access granted");
                return;
            }
            
        } while (counter < MAX_ATTEMPTS);
        System.out.println("Access restricted");
    }

    private static String getInput(String type) {
        System.out.println("Please enter the " + type);
        return scanner.nextLine();
    }
}