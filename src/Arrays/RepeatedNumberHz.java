package Arrays;

import java.util.Arrays;

public class RepeatedNumberHz {


    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        int value = list[0], count = 1, index = 1;
        for (int j = 1; j < list.length; j++) {
            for (int i = index; i < list.length; i++) {
                if (value == list[i]) {
                    count++;
                    if (index < list.length) index = i + 1;
                }
            }
            System.out.println(value + " sayısı " + count + " kere tekrar edildi.");
            if (index == list.length) break;
            value = list[index];
            count = 0;
        }
    }
}

