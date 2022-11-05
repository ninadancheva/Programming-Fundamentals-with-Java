package Excercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //o	Price per capsule - floating-point number in the range [0.00…1000.00].
        //o	Days – integer in the range [1…31].
        //o	Capsules count - integer in the range [0…2000].

        int N = Integer.parseInt(scanner.nextLine());// брой поръчки
        double totalPrice = 0;
        //((daysInMonth * capsulesCount) * pricePerCapsule)
        for (int i = 1; i <= N; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double priceCoffee = ((days * capsulesCount) * pricePerCapsule);
            totalPrice = totalPrice + priceCoffee;

            System.out.printf("The price for the coffee is: $%.2f%n", priceCoffee);

        }
        System.out.printf("Total: $%.2f", totalPrice);

    }
}
