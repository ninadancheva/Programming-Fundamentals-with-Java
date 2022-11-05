package Lab;

import java.util.Scanner;

public class Backin30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes+30;

        if (minutes>=60){
            minutes = minutes-60;
            hour++;
        }

        if (hour>=24){
            hour = hour-24;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
