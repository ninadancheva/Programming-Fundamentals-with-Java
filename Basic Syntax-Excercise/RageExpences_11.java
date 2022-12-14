package Excercise;

import java.util.Scanner;

public class RageExpences_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	On the first input line - lost games count – integer in the range [0, 1000].
        //•	On the second line – headset price - the floating-point number in the range [0, 1000].
        //•	On the third line – mouse price - the floating-point number in the range [0, 1000].
        //•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
        //•	On the fifth line – display price - the floating-point number in the range [0, 1000].

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double loses = 0;
        int countKeyboard = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                loses = loses + headsetPrice;
            }
            if (i % 3 == 0) {
                loses = loses + mousePrice;
            }
            if (i % 6 ==0){
                countKeyboard++;
                loses = loses + keyboardPrice;
            }
            if (i % 12 ==0){
                loses = loses + displayPrice;
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", loses);

    }
}
