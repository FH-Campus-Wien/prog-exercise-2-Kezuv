package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        float numb;
        int count = 1;
        float biggest = 0;

        System.out.print("Number " + count +": ");
        numb = scanner.nextFloat();

        if (numb > 0) {
            do {
                count++;
                System.out.print("Number " + count +": ");
                numb = scanner.nextFloat();
                if (numb > biggest){
                    biggest = numb;
                }
            } while (numb > 0);
            System.out.print("The largest number is ");
            System.out.printf("%.2f",biggest);
            System.out.println();

        } else {
            System.out.println("No number entered.");
        }
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
            System.out.print("n: ");
            int n = scanner.nextInt();
            int count  =1;

            for (int i=1; i <= n ; i ++){
                for (int j = 1; j<=i;j++){
                    System.out.print(count+" ");
                    count++;
                }
                 System.out.println();
            }
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        final int ROWS = 6;
        final int COLS = 11;


        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}