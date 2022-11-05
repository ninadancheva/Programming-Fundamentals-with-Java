package Excercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double total = 0;
        switch (type){

            case "Students":
                if (day.equals("Friday")){
                    total = number*8.45;
                } else if (day.equals("Saturday")) {
                    total = number*9.80;
                } else if (day.equals("Sunday") ) {
                    total = number*10.46;
                }
                if (number>=30){
                    total = total - 0.15*total;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    total = number*10.90;
                } else if (day.equals("Saturday")) {
                    total = number*15.60;
                } else if (day.equals("Sunday") ) {
                    total = number*16;
                }
                if (number>=100){
                    if (day.equals("Friday")){
                        total = (number-10)*10.90;
                    } else if (day.equals("Saturday")) {
                        total = (number-10)*15.60;
                    } else if (day.equals("Sunday")) {
                        total = (number-10)*16;
                    }
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    total = number*15;
                } else if (day.equals("Saturday")) {
                    total = number*20;
                } else if (day.equals("Sunday") ) {
                    total = number*22.50;
                }
                if (number>=10&&number<=20){
                    total = total - 0.05*total;
                }
                break;
        }
        System.out.printf("Total price: %.2f", total);
    }
}
