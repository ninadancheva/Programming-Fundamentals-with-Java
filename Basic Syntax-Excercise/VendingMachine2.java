package Excercise;

import java.util.Scanner;

public class VendingMachine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
//0.1, 0.2, 0.5, 1, and 2 coins
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1) {
                sum = sum + coins;
            } else if (coins == 0.2) {
                sum = sum + coins;
            } else if (coins == 0.5) {
                sum = sum + coins;
            } else if (coins == 1) {
                sum = sum + coins;
            } else if (coins == 2) {
                sum = sum + coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();

        }
        //"\"Nuts\", \"Water\", \"Crisps\", \"Soda\", \"Coke\". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 "
        String product = scanner.nextLine();
        double price = 0;
        boolean isValid = false;
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    isValid = true;
                    break;
                case "Water":
                    price = 0.7;
                    isValid = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    isValid = true;
                    break;
                case "Soda":
                    price = 0.8;
                    isValid = true;
                    break;
                case "Coke":
                    price = 1.0;
                    isValid = true;
                    break;
            }

        if (price > sum) {
            System.out.println("Sorry, not enough money");
        } else if (isValid) {
            System.out.printf("Purchased %s%n", product);
            sum = sum - price;
        }else {
            System.out.println("Invalid product");
        }

            product = scanner.nextLine();

    }
        System.out.printf("Change: %.2f", sum);

}}
