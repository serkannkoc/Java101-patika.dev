package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class FlightPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance (km): ");
        int distance = input.nextInt();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter the type of the flight (1 for one way, 2 for two way): ");
        int flightType = input.nextInt();

        if (distance < 0 || age < 0 || flightType < 0 || flightType > 2) {
            System.out.print("You entered invalid input!");
        }else {
            double flightPrice = distance * 0.1;

            if(age<12){
            flightPrice -= flightPrice * 0.5;
            }else if(age<24){
            flightPrice -= flightPrice * 0.1;
            }else if(age > 65){
            flightPrice -= flightPrice * 0.3;
            }

            if(flightType == 2)
                flightPrice =(flightPrice - (flightPrice * 0.2)) *2 ;

            System.out.print("Total price : "+flightPrice);
        }

    }
}
