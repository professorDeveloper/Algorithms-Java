package ifdirect;

import java.util.Scanner;

public class if8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Birinchi Sonni kiriting: ");
        int a =scanner.nextInt();
        System.out.println("Ikkinchi Sonni kiriting :");
        int b =scanner.nextInt();
        if (a>b){
            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(b);
            System.out.println(a);
        }
    }
}
