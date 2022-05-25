package uz.gita.lesson1;

import java.util.Scanner;

public class Begin2 {
    public static void main(String[] args) {
        // Qiymat kiritish
        Scanner scanner = new Scanner(System.in);
        double a, s; // haqiqiy sonlar uchun double ishlatiladi
        System.out.print("Kvadrat tomonini kiriting: ");
        a = scanner.nextDouble();
        s = Math.pow(a,2); // a^n = a*a*a*a*a*...*a

        System.out.println("yuza = "+s);
    }
}
