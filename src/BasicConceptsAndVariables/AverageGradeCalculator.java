package BasicConceptsAndVariables;

import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music;
        Scanner inp = new Scanner(System.in);

        System.out.print("Math grade ?");
        math = inp.nextInt();

        System.out.print("Physics grade ?");
        physics = inp.nextInt();

        System.out.print("Chemistry grade ?");
        chemistry = inp.nextInt();

        System.out.print("Turkish grade ?");
        turkish = inp.nextInt();

        System.out.print("History grade ?");
        history = inp.nextInt();

        System.out.print("Music grade ?");
        music = inp.nextInt();

        int sum = math + physics + chemistry + turkish + history + music;
        double averageGrade = sum / 6.0;
        System.out.println("Your average grade is =" + averageGrade);

        String isPassed = (averageGrade > 60) ? "You passed the class" : "You failed the class" ;
        System.out.print(isPassed);
    }
}