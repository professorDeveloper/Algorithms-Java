package ifdirect;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b) System.out.println("Kattasi " + a);
        else if (b > a) System.out.println("Kattasi " + b);
        else System.out.println("Ikkalasi teng");
    }
}
