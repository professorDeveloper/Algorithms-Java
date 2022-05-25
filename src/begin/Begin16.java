package uz.gita.lesson1;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, x2, masofa;
        System.out.print("x1 = ");
        x1 = scanner.nextDouble();
        System.out.print("x2 = ");
        x2 = scanner.nextDouble();

        masofa = Math.abs(x2 - x1); // masofa
        System.out.println("Masofa = " + masofa);
    }
}
