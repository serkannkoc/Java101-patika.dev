package Arrays;

public class HarmonicAvgCalc {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double total = 0;
        int c = 0;
        for (int i : numbers) {
            total += (1.0 / i);
            c++;
        }
        total = total / c;

        System.out.println(total);

    }
}
