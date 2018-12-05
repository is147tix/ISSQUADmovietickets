package com.company;
import java.util.Scanner;

    public class CustomerAccount {
        static Scanner input = new Scanner(System.in);
        private int num;
        private String fullName;


    public CustomerAccount(String fullName, int num){
        this.fullName = fullName;
        this.num = num;
    }


    public static void payment(){
        System.out.println("Please Pay using a Credit card (enter 1) or a Debit card (Enter 2).");
        int method = input.nextInt();

        System.out.println("Please input your card number");
        int cardNum = input.nextInt();

        switch(method){
            case 1: System.out.println("Please enter zip code");
                    int zip = input.nextInt();
                    break;
            case 2: System.out.println("Please enter pin code");
                    int pin = input.nextInt();
                    break;
        }

                System.out.println("Please input your expiration date for example 08/18 should be entered as 0818.");
                int expDate = input.nextInt();
                //if this date is sooner than today, than decline...

                System.out.println("Please input your billing street address. ");
                String street = input.nextLine();

    }

}
