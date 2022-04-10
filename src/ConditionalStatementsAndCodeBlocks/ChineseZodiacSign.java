package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class ChineseZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the birth year: ");
        int birthYear = input.nextInt();

        int remainder = birthYear % 12 ;

        switch (remainder){
            case 0:
                System.out.println("Your chinese zodiac sign is Monkey");
                break;
            case 1:
                System.out.println("Your chinese zodiac sign is Rooster");
                break;
            case 2:
                System.out.println("Your chinese zodiac sign is Dog");
                break;
            case 3:
                System.out.println("Your chinese zodiac sign is Pig");
                break;
            case 4:
                System.out.println("Your chinese zodiac sign is Rat");
                break;
            case 5:
                System.out.println("Your chinese zodiac sign is Ox");
                break;
            case 6:
                System.out.println("Your chinese zodiac sign is Tiger");
                break;
            case 7:
                System.out.println("Your chinese zodiac sign is Rabbit");
                break;
            case 8:
                System.out.println("Your chinese zodiac sign is Dragon");
                break;
            case 9:
                System.out.println("Your chinese zodiac sign is Snake");
                break;
            case 10:
                System.out.println("Your chinese zodiac sign is Horse");
                break;
            case 11:
                System.out.println("Your chinese zodiac sign is Goat");
                break;


        }
    }
}
