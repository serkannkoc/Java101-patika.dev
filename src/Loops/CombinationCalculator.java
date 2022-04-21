package Loops;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter r: ");
        int r = input.nextInt();
        int sumN = 1;
        for (int i = 1; i <= n; i++) {
            sumN *= i;
        }
        int sumR = 1;
        for (int i = 1; i <= r; i++) {
            sumR *= i;
        }
        int sumNR = 1;
        for (int i = 1; i <= n - r; i++) {
            sumNR *= i;
        }
        System.out.println("Combination: " + sumN / (sumR * sumNR));
    }
}
