package ifdirect;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kiriting: ");
        int a = scanner.nextInt();
        if (a >= 0) {
            a++;
        }
        System.out.println(a);
    }
}
