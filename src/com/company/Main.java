package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        final int ageRatedR = 17;

        System.out.println("           **********************************************");
        System.out.println("           * Welcome to the ISSQUAD Movie Ticket System *");
        System.out.println("           **********************************************\n");

        String[][] movieTitles = {{"Movie Title           |", "Movie Rating |", " First Showing |", "Second Showing |"},
                {"Bohemian Rhapsody     |", "    PG-13    |", "    4:30pm     |", "   8:00pm      |"},
                {"Dr. Seuss' the Grinch |", "     PG      |", "    12:30pm    |", "   3:00pm      |"},
                {"Overlord              |", "     R       |", "    7:30pm     |", "  10:00pm      |"},
                {"Widows                |", "     R       |", "    2:00pm     |", "   5:00pm      |"}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(movieTitles[i][j] + "  ");
            }
            System.out.println("\n__________________________________________________________________________");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nChoose a movie (1-4): ");
        int movie = input.nextInt();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if ((movie <= 3) && age < ageRatedR) {
            System.out.println("Age requirement not met!  Please choose another movie");
        }
        else {
            System.out.println("You selected " + movieTitles[movie][0]);
        }
    }
}
