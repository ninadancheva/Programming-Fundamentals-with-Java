package Lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //two lines. On the first line, you will receive the type of day. On the second – the age of the person.

        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        double ticket = 0;
        switch (typeDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticket = 12;
                }else if (age > 18 && age <= 64){
                    ticket = 18;
            } else if (age > 64 && age <= 122) {
                    ticket = 12;
                }else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticket = 15;
                }else if (age > 18 && age <= 64){
                    ticket = 20;
                } else if (age > 64 && age <= 122) {
                    ticket = 15;
                }else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticket = 5;
                }else if (age > 18 && age <= 64){
                    ticket = 12;
                } else if (age > 64 && age <= 122) {
                    ticket = 10;
                } else {
                    System.out.println("Error!");
                    break;
        }

    }
    if (age>=0 && age <=122){
        System.out.printf("%.0f$", ticket);

}}}
