package BasicConceptsAndVariables;

import java.util.Locale;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the height in meters: ");
        double height = inp.nextDouble();
        System.out.print("Enter the weight in kilograms: ");
        double weight = inp.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your body mass index is: "+ bmi );
    }
}
