package Loops;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter n2: ");
        int n2 = input.nextInt();

        int gcd =1;
        int k = n1;
        while(k>=1){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
                break;
            }
            k--;
        }
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+(n1*n2/gcd));
    }
}
