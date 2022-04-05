package BasicConceptsAndVariables;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = inp.nextInt();
        System.out.print("Enter the center angle of the circle: ");
        int angle = inp.nextInt();

        double area = (Math.PI*(radius*radius)*angle)/360;
        System.out.print("The area of the circle is: "+area);
    }
}
