package Loops;

import java.util.Scanner;

public class ExponentialNumberCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the exponent part: ");
        int exp = input.nextInt();
        int sum = 1;
        for (int i = 0; i < exp; i++) {
            sum *= number;
        }
        System.out.println("Result: " + sum);
    }
}
