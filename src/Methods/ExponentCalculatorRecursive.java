package Methods;

public class ExponentCalculatorRecursive {
    public static void main(String[] args) {
        System.out.println(exponent(3, 4));
    }

    static int exponent(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        } else
            return exponent(number, exponent - 1) * number;
    }
}
