package Loops;

import java.util.Scanner;

public class MinMaxSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int number = input.nextInt();
        int min = 0;
        int max = 0;
        int x;
        for (int i = 1; i <= number; i++) {
            System.out.print("Enter number " + i + ": ");
            x = input.nextInt();
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
    }
}
