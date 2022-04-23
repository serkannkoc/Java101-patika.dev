package Methods;

import java.util.Scanner;

public class ExponentCalculatorRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        System.out.println(exponent(number, power));
    }

    static int exponent(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        } else
            return exponent(number, exponent - 1) * number;
    }
}
