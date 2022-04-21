package Loops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            k = input.nextInt();
            if (k % 4 == 0)
                sum += k;
            if (k % 2 == 1)
                break;
        }
        System.out.print("Sum: " + sum);
    }
}
