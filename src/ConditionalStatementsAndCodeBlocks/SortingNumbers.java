package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter number a: ");
        a = input.nextInt();
        System.out.print("Enter number b: ");
        b = input.nextInt();
        System.out.print("Enter number c: ");
        c = input.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.print("a < b < c");
            } else if (c < b) {
                System.out.print("a < c < b");
            } else {
                System.out.print("a < b = c");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.print("b < a < c");
            } else if (c < a) {
                System.out.print("b < c < a");
            } else {
                System.out.print("b < c = a");
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.print("c < a < b");
            } else if (b < a) {
                System.out.print("c < b < a");
            } else {
                System.out.print("c < b = a");
            }
        } else if (a == b && b == c) {
            System.out.print("a = b = c");
        }
    }
}
