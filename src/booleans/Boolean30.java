package booleans;

import java.util.Scanner;

public class Boolean30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        boolean bool = a == b && a == c; // teng tomonli

        System.out.println("Uchburchak teng tomonli " + bool);
    }
}
