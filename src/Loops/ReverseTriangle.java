package Loops;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int size = input.nextInt();

        for (int i = size; i > 0; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
