package edu.pedro.primeirasemana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        firstName = capitalize(firstName);

        System.out.print("Enter your last name: ");
        String lastName = sc.next();
        lastName = capitalize(lastName);
        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
        sc.close();

    }

    // This method is used to concatenate two strings go form a full name of a person
    public static String fullName(String firstName, String lastName) {
        return "Your full name is: " + firstName.concat(" ") + lastName;
    }

    // This method is used to capitalize the string in case of is not already
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

}