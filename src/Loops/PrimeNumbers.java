package Loops;

public class PrimeNumbers {
    public static void main(String[] args) {
        int prime = 0, count = 0;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < 100; j++)
                if (i % j == 0)
                    count++;
            if (count < 2)
                System.out.print(i + " ");
            count = 0;
        }
    }
}
