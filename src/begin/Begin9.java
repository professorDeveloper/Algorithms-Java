package uz.gita.lesson1;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();

        // O'rta geometrik c = sqrt(a*b);
        c = Math.sqrt(a * b);
        System.out.println("c = " + c);
    }
}
