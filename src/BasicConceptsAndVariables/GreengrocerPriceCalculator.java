package BasicConceptsAndVariables;

import java.util.Scanner;

public class GreengrocerPriceCalculator {
    public static void main(String[] args) {
        double pear, apple, tomato, banana, aubergine;
        pear = 2.14;
        apple = 3.67;
        tomato = 1.11;
        banana = 0.95;
        aubergine = 5.0;

        Scanner inp = new Scanner(System.in);
        System.out.print("How many kilos pear? ");
        double pearWeight = inp.nextDouble();
        System.out.print("How many kilos apple? ");
        double appleWeight = inp.nextDouble();
        System.out.print("How many kilos tomato? ");
        double tomatoWeight = inp.nextDouble();
        System.out.print("How many kilos banana? ");
        double bananaWeight = inp.nextDouble();
        System.out.print("How many kilos aubergine? ");
        double aubergineWeight = inp.nextDouble();

        double sum = pear * pearWeight + apple * appleWeight + tomato * tomatoWeight + banana * bananaWeight + aubergine * aubergineWeight;

        System.out.print("Total price: " + sum);
    }
}
