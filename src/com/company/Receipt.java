package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class Receipt{
    static Scanner input = new Scanner(System.in);

        public static void printTime(){
            //Get current date time
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formatDateTime = now.format(formatter);
            System.out.print(formatDateTime + "\n");
        }

        public static void getCustomerName(){
            System.out.print("Please enter your first name: ");
            String enteredFirst = input.nextLine();
            String firstName = enteredFirst.substring(0, 1).toUpperCase() + enteredFirst.substring(1).toLowerCase();

            System.out.print("Please enter your last name: ");
            String enteredLast = input.nextLine();
            String lastName = enteredLast.substring(0, 1).toUpperCase() + enteredLast.substring(1).toLowerCase();

            String fullName = firstName + lastName;

        }

        public static void confirmationNum() {

            int confirmationNum = (int) (Math.random() * 9999 + 1);
            System.out.println("Your confirmation# is " + confirmationNum);
            System.out.println("Thank You for your movie purchase, we hope you enjoy the movie!");
        }

    }


    //In Java, a static member is a member of a class that isn’t associated with an instance of a class. Instead, the member belongs to the class itself.
//private String userName, custFirst, custLast;

       /* public void CustomerInfo(String userFirst, String userLast, int age)
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

        }*/