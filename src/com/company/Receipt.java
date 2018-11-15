package com.company;

import java.util.Random;

    public class Receipt{

        private int userAge, confirmationNum;
        private String userName, custFirst, custLast;



        public void CustomerInfo(String userFirst, String userLast, int age)
        {
            userName = userFirst.concat(" "+userLast);
            userAge  = age;
            System.out.println();
        }

        public void CustomerName(String userFirst, String userLast){
            custFirst = userFirst;
            custLast = userLast;
        }

        public void getConfirmationNum(){

        }
        public void PrintReceipt(){

            System.out.print("Thank you for purchasing a movie ticket:");
            System.out.println(userName);
            System.out.println("Here is your confirmation number: " + confirmationNum);

        }
    }