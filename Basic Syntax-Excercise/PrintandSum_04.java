package Excercise;

import java.util.Scanner;

public class PrintandSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = firstNumber; i<=lastNumber; i++){
            sum = sum+i;
            System.out.print(i + " ");
        }
        System.out.printf("%nSum: %d", sum );
    }
}
