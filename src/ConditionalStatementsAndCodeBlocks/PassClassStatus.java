package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class PassClassStatus {
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


        int sum = 0;
        int countLectures = 0;
        if(math >= 0 && math<=100) {
            sum += math;
            countLectures++;
        }
        if(physics >= 0 && physics<=100){
            sum += physics;
            countLectures++;
        }
        if(chemistry >= 0 && chemistry<=100){
            sum += chemistry;
            countLectures++;
        }
        if(turkish >= 0 && turkish<=100){
            sum += turkish;
            countLectures++;
        }
        if(history >= 0 && history<=100){
            sum += history;
            countLectures++;
        }
        if(music >= 0 && music<=100){
            sum += music;
            countLectures++;
        }


        double averageGrade = sum / countLectures;

        if(averageGrade<= 55){
            System.out.println("You have failed the class");
        }else {
            System.out.println("You have passed the class");
        }

        System.out.println("Your average : "+averageGrade);
    }
}
