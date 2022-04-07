package ConditionalStatementsAndCodeBlocks;
import java.util.Scanner;

public class ZodiacSignCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;

        System.out.print("Enter the birth month: ");
        month = inp.nextInt();
        System.out.print("Enter the birth day: ");
        day = inp.nextInt();

        if (month == 1){
            if (day >= 1) {
                if (day < 22) {
                    System.out.println("You are Capricorn.");
                } else if (day <= 31) {
                    System.out.println("You are Aquarius.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 2){
            if (day >= 1) {
                if (day < 20) {
                    System.out.println("You are Aquarius.");
                } else if (day <= 29) {
                    System.out.println("You are Pisces.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 3){
            if (day >= 1) {
                if (day < 21) {
                    System.out.println("You are Pisces.");
                } else if (day <= 31) {
                    System.out.println("You are Aries.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 4){
            if (day >= 1) {
                if (day < 21) {
                    System.out.println("You are Aries.");
                } else if (day <= 30) {
                    System.out.println("You are Taurus.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 5){
            if (day >= 1) {
                if (day < 22) {
                    System.out.println("You are Taurus.");
                } else if (day <= 31) {
                    System.out.println("You are Gemini.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 6){
            if (day >= 1) {
                if (day < 23) {
                    System.out.println("You are Gemini.");
                } else if (day <= 30) {
                    System.out.println("You are Cancer.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 7){
            if (day >= 1) {
                if (day < 23) {
                    System.out.println("You are Cancer.");
                } else if (day <= 31) {
                    System.out.println("You are Leo.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 8){
            if (day >= 1) {
                if (day < 23) {
                    System.out.println("You are Leo.");
                } else if (day <= 31) {
                    System.out.println("You are Virgo.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 9){
            if (day >= 1) {
                if (day < 23) {
                    System.out.println("You are Virgo.");
                } else if (day <= 30) {
                    System.out.println("You are Libra.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 10){
            if (day >= 1) {
                if (day < 23) {
                    System.out.println("You are Libra.");
                } else if (day <= 31) {
                    System.out.println("You are Scorpion.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 11){
            if (day >= 1) {
                if (day < 22) {
                    System.out.println("You are Scorpion.");
                } else if (day <= 30) {
                    System.out.println("You are Sagittarius.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }

        if (month == 12){
            if (day >= 1) {
                if (day < 22) {
                    System.out.println("You are Sagittarius.");
                } else if (day <= 31) {
                    System.out.println("You are Capricorn.");
                } else {
                    System.out.println("Invalid day!!");
                }
            }
        }
    }
}
