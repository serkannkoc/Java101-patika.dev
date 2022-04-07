package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class SuggestedActivities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temperature = input.nextInt();

        if(temperature<5){
            System.out.println("You should ski!");
        }else if(temperature<15){
            System.out.println("You should go to cinema!");
        }else if(temperature<25){
            System.out.println("You should go to picnic!");
        }else {
            System.out.println("You should swim!");
        }
    }
}
