package booleans;

import java.util.Scanner;

public class boolean32 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("A :");
        double a=scanner.nextDouble();
        System.out.println("B :");
        double b=scanner.nextDouble();
        System.out.println("C :");
        double c=scanner.nextDouble();
        boolean result=(a*a)+(b*b)==(c*c) && (a+b>c && a-b<c);
        System.out.println("Teng yonli :"+result);

    }
}
