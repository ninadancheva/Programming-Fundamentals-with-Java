package Excercise;

import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numOne = Integer.parseInt(scanner.nextLine());
        Integer numTwo = Integer.parseInt(scanner.nextLine());
        Integer numThree = Integer.parseInt(scanner.nextLine());


        if (numOne>=numTwo&&numOne>=numThree){
            System.out.println(numOne);
            if (numTwo>=numThree){
                System.out.println(numTwo);
                System.out.println(numThree);
            }else if (numThree > numTwo){
                System.out.println(numThree);
                System.out.println(numTwo);
            }
        } else if (numTwo>numOne&&numTwo>numThree) {
            System.out.println(numTwo);
            if (numOne>=numThree){
                System.out.println(numOne);
                System.out.println(numThree);
            }else if (numThree > numOne){
                System.out.println(numThree);
                System.out.println(numOne);
            }

        } else if (numThree>numOne&&numThree>numTwo) {
            System.out.println(numThree);
            if (numOne>=numTwo){
                System.out.println(numOne);
                System.out.println(numTwo);
            }else if (numTwo > numOne){
                System.out.println(numTwo);
                System.out.println(numOne);

    }
}}}
