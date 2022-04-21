package Loops;

import java.util.Scanner;

public class DivisibleBy12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = input.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1;i<=k;i++){
            if(i % 12 == 0){
                count ++;
                sum += i;
            }
        }
        System.out.print("Average is: "+ (double)(sum / count));

    }
}
