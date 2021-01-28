package c_p;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Консольная программа на JAVA");
            System.out.print("Введите X(число):");
            double x = scan.nextInt();
            System.out.print("Введите А(число, более нуля):");
            double a = scan.nextInt();
            System.out.print("Введите B(число, более нуля):");
            double b = scan.nextInt();
            double y;

            if (x > 4) {
                y = 5 * Math.pow(x, 2) + Math.pow(b, 2);
            } else {
                y = 6 * (Math.pow(x, 2) - Math.pow(a, 2));
            }
            System.out.format("Y=%.3f", y);
            System.out.println();
     } catch (Exception e) {
           System.out.println("Входные параметры заданы неверно!");
         }
    }
}

