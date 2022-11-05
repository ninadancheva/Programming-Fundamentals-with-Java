package Excercise;

import java.util.Scanner;

public class StronNumberNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int starNumber = number;

        int sumFact = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            //намиране на факториела;
            int fact = 1;
            for (int i=1; i<=lastDigit; i++){
                fact = fact * i;
            }
            sumFact +=fact;
            number = number / 10;
        }
        if (sumFact==starNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

