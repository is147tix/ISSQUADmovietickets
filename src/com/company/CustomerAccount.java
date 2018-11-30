

package com.company;

import java.util.Scanner;

public class CustomerAccount {

    static Scanner input = new Scanner(System.in);


    public String custInfo() {
        System.out.print("Please enter your first name: ");
        String enteredFirst = input.nextLine();
        String firstName = enteredFirst.substring(0, 1).toUpperCase() + enteredFirst.substring(1).toLowerCase();

        System.out.print("Please enter your last name: ");
        String enteredLast = input.nextLine();
        String lastName = enteredLast.substring(0, 1).toUpperCase() + enteredLast.substring(1).toLowerCase();

        int confirmationNum = (int) (Math.random() * 9999 + 1);

        System.out.println(lastName + ", " + firstName);

        System.out.println("Account Number # " + confirmationNum);

        return lastName;
    }

    public int age() {
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        return age;
    }
}
