package BasicConceptsAndVariables;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first length: ");
        int firstLength = inp.nextInt();
        System.out.print("Enter the second length: ");
        int secondLength = inp.nextInt();
        System.out.print("Enter the third length: ");
        int thirdLength = inp.nextInt();

        int halfPerimeterOfTriangle = (firstLength + secondLength + thirdLength) / 2;


        double areaOfTriangle = Math.sqrt(halfPerimeterOfTriangle *
                (halfPerimeterOfTriangle - firstLength) *
                (halfPerimeterOfTriangle - secondLength) *
                (halfPerimeterOfTriangle - thirdLength));
        System.out.println("Area of the triangle is : " + areaOfTriangle);
    }
}
