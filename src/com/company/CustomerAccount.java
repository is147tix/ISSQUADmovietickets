package com.company;

import java.util.Scanner;

public class CustomerAccount {
    static Scanner input = new Scanner(System.in);
    private int num;
    private String fullName;
    private double cardNum;

    public CustomerAccount() {
    }

    public CustomerAccount(String fullName, int num) {
        this.fullName = fullName;
        this.num = num;
    }


    public void payment() {
        System.out.println("Please Pay using a Credit card (enter 1) or a Debit card (Enter 2): ");
        int method = input.nextInt();

        System.out.println("Please input your card number: ");
        cardNum = input.nextDouble();


        switch (method) {
            case 1:
                System.out.println("Please enter zip code: ");
                int zip = input.nextInt();
                break;
            case 2:
                System.out.println("Please enter pin code: ");
                int pin = input.nextInt();
                break;

        }

        System.out.print("Please input your expiration date (for example 08/18 should be entered as 0818): ");
        int expDate = input.nextInt();

        //String card = Double.toString(double cardNum);
        //String last4char = card.substring(0, 4);
        //System.out.println("\nCard Number: XXXX XXXX XXXX " + last4char);
        System.out.println("\nYour credit card been successfully billed");

    }

}
