package Excercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length()-1; position>=0; position--){
            char currentSymbol = username.charAt(position);
            password +=currentSymbol;
        }
        boolean mostTries = false;
        String input = scanner.nextLine();
        int countInputs = 0;
        while (!input.equals(password)) {
            countInputs++;
            if (countInputs >= 4) {
                mostTries = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (mostTries){
            System.out.printf("User %s blocked!", username);
        }else {
        System.out.printf("User %s logged in.", username);


    }}}

