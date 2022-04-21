package Loops;

import java.util.Scanner;

public class ExponentsOf4and5 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ending number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 20) {
            System.out.println(i);
        }
    }
}
