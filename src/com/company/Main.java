package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//menu, prices, customerAccount, receipt
        Menu.printMenu();
        Prices.pricing();
        Receipt.getCustomerName();
        CustomerAccount.payment(); //still not print billing address line
        Receipt.confirmationNum();
        Receipt.printTime();

    }
}