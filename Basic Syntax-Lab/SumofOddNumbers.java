package Lab;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            sum = sum + odd;
            System.out.printf("%d%n", odd);
        }
        System.out.printf("Sum: %d", sum);
    }
}

