package Lab;

import java.util.Scanner;

public class TableTWo {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int result = 0;
        if (b <= 10) {
            for (int i = b; i <= 10; i++) {
                result = a * i;
                System.out.printf("%d X %d = %d%n", a, i, result);

            }}
        if (b>10){
            result = a * b;
            System.out.printf("%d X %d = %d%n", a, b, result);
        }

    }
}

