import java.util.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "admin";
        double balance = 0;
        System.out.println("Welcome to our only coffe shop in the world!");
        System.out.println("You have to login first: ");
        System.out.println("Enter your username: ");
        String usernamee = scanner.nextLine();
        System.out.println("Enter your password: ");
        String passworde = scanner.nextLine();

        if (usernamee.equals(username) && passworde.equals(password)) {
            System.out.println("Welcome" + username + "!");
            System.out.println("Your balance is: " + balance);
            System.out.println("What do you want to do?" +  "we have 3 options: 1. buy coffee, 2. add balance, 3. exit");
               int option = scanner.nextInt();
               if (option == 2) {
                System.out.println("How much do you wanna add?");
                double addbalancee = scanner.nextDouble();
                balance += addbalancee;
                System.out.println("Your balance is: " + balance);
            }
            else{
                System.out.println("You didn't add balance. Your balance is: " + balance);
                
            }   
            if (option == 3) {
                System.exit(0);
                
            }
                if(option == 1){
                    System.out.println("We have 3 types of coffee: 1. Turkish coffee, 2. Espresso, 3. Latte");
                    System.out.println("Which one do you want to buy?");
                    int coffee = scanner.nextInt();
                    if(coffee == 1){
                        System.out.println("It cost 5 euros but you have 0 euros in your balance. Do you want to add balance? 1. Yes, 2. No");
                        int add = scanner.nextInt();
                        if (add == 1) {
                            System.out.println("How much do you wanna add?");
                            double addbalance = scanner.nextDouble();
                            balance += addbalance;
                            System.out.println("Your balance is: " + balance);
                            System.out.println("Do you want to buy coffee now? 1. Yes, 2. No");
                            int addd = scanner.nextInt();
                            if (addd == 1) {
                                System.out.println("You bought Turkish coffee. Your balance is: " + (balance - 5));
                                System.out.println("Anything else?");
                                System.out.println("1. Buy coffee, 2. Add balance, 3. Exit");
                                int option2 = scanner.nextInt();
                                if(option2 == 1){
                                    System.out.println("We have 3 types of coffee: 1. Turkish coffee, 2. Espresso, 3. Latte");
                                    System.out.println("Which one do you want to buy?");
                                    int coffee2 = scanner.nextInt();
                                    if(coffee2 == 1){
                                        System.out.println("It cost 5 euros but you have " + balance + " euros in your balance. Do you want to buy? 1. Yes, 2. No");
                                        int buy = scanner.nextInt();
                                        if(buy == 1){
                                            System.out.println("You bought Turkish coffee. Your balance is: " + (balance - 5));
                                        }
                                        else{
                                            System.out.println("You didn't buy coffee. Your balance is: " + balance);
                                        }
                                    }
                                }
                                else if(option2 == 2){
                                    System.out.println("How much do you wanna add?");
                                    double addbalance2 = scanner.nextDouble();
                                    balance += addbalance2;
                                    System.out.println("Your balance is: " + balance);
                                    System.out.println("Do you want to buy coffee now? 1. Yes, 2. No");
                                    int addd2 = scanner.nextInt();
                                    if(addd2 == 1){
                                        System.out.println("You bought Turkish coffee. Your balance is: " + (balance - 5));
                                    }
                                    else{
                                        System.out.println("You didn't buy coffee. Your balance is: " + balance);
                                    }

                                }
                            }
                            else{
                                System.out.println("You didn't buy coffee. Your balance is: " + balance);
                            }
                            
                        }
                    }
                }
        }
        else{
            System.out.println("Wrong username or password!");
            System.exit(0);
        }

    }
    
    private static void karta() {
        
    }
}    

