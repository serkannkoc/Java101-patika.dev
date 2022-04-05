package BasicConceptsAndVariables;

import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the money amount:");
        int money = inp.nextInt();
        int kdvAmount;
        if(money>0 && money<1000){
             kdvAmount = 18;
        }else
            kdvAmount = 8;

        double kdv = money * kdvAmount / 100.0 ;
        double moneyWithKDV = kdv + money;
        System.out.println("The amount of money without KDV: "+money);
        System.out.println("The percentage of KDV: "+kdvAmount);
        System.out.println("The amount of KDV: "+kdv);
        System.out.println("The amount of money with the KDV: "+moneyWithKDV);

    }
}
