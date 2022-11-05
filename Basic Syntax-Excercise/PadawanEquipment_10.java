package Excercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	The amount of money George Lucas has – floating-point number in range [0.00…1,000.00]
        //•	The count of students – integer in range [0…100]
        //•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
        //•	The price of robes for a single robe – floating-point number in range [0.00…100.00]
        //•	The price of belts for a single belt – floating-point number in range [0.00…100.00]

        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceSabre = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        //sabresPrice*(studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice*(studentsCount-freeBelts)
        //1*(3) + 2*(2) + 3*(2) = 13.00
        //13.00 <= 100 – the money will be enough.
        //every sixth belt is free

        int freeBelt = studentsCount / 6;

        double budget = (Math.ceil(studentsCount + 0.1 * studentsCount)) * priceSabre + priceRobe * studentsCount +
                (studentsCount - freeBelt) * priceBelts;
        if (budget <= moneyAvailable) {
            System.out.printf("The money is enough - it would cost %.2flv.", budget);

        } else {
            System.out.printf("George Lucas will need %.2flv more.", budget-moneyAvailable);
        }

    }
}
