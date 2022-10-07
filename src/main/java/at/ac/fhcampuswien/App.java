package at.ac.fhcampuswien;

import java.io.IOException;
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

            if (n<=0){
                System.out.println("Invalid number!");
            }
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
    int rows = 6;
        for (int i = 0 ; i<=rows-1; i++) {

            for (int j = 2 ;   j <= rows - i    ;   j++) {
                System.out.print(" ");
            }
             for (int k=1    ;   k<=2*i+1    ;    k++) {
                 System.out.print("*");
             }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int h;
        System.out.print("h: ");
        h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 != 0) {

            for (int r = h/2; r>=0; r--) {

                for (int a = r; a>0; a--) {
                    System.out.print(" ");
                }
                for (int b=r ; b <=h/2 ; b ++){
                    System.out.print((char) (c + (-h/2) + b));
                }
                for (int f =h/2+1; f <h-r; f++){
                    System.out.print((char) (c  + (h/2)-f));
                }

                System.out.println();
            }
// Pyramide bis einschließlich Reihe 0
            for (int r = 1; r<=h/2; r++) {
                for (int a = r; a>0; a--) {
                    System.out.print(" ");
                }
                for (int b=r ; b <=h/2 ; b ++){
                    System.out.print((char) (c + (-h/2) + b));
                }

                for (int f =h/2+1; f <h-r; f++){
                    System.out.print((char) (c + (h/2)-f));
                }

                System.out.println();
            }
//Pyramide von Reihe /2 bis Ende
            } else{
                System.out.println("Invalid number!");
            }
        }
        // input your solution here
    //todo Task 5
    public void marks() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        int count;
        int marks = 0;
        count = 1;

        System.out.print("Mark " + count + ": ");
        n = scanner.nextInt();

        if (n>0) {
            while (n != 0) {
                count++;

                if (n < 5) {
                    sum = sum + n;
                }

                if (n == 5) {
                    marks++;
                    sum = sum + n;
                }

                if (n > 5) {
                    System.out.println("Invalid mark!");
                    count--;
                }

                System.out.print("Mark " + count + ": ");
                n = scanner.nextInt();
            }
            count--;
            double average = (double) sum / count;
            System.out.print("Average: ");
            System.out.printf("%.2f", average);
            System.out.println();
            System.out.println("Negative marks: " + marks);
        } else {
            count = 0;
            double average = (double) sum / count;
            System.out.print("Average: 0.00");
            System.out.println();
            System.out.println("Negative marks: 0");
        }
    }
        // input your solution here

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args) throws IOException {
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