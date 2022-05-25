package ifdirect;

import java.util.Scanner;

public class If27 {
    /**
     * x - haqiqiy soni kiritiladi
     * 0 - agar x<0
     * 1 - [0..1), [2..3) ...
     * -1 - [1..2), [3..4) ...
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kiriting: ");
        double x = scanner.nextDouble();
        /* Algoritm: x = 20.5
         * 1. sonning butun qismi olinadi          1
         * 2. 2ga qoldigli bo'lamiz va qoldig'i olinadi 20%2=0
         * 3. qoldiq == 0 -> 1
         * aks holda -1
         * */
        if (x < 0) System.out.println(0);
        else {
            int butunQism = (int) x; // casting - double to int 20.7 -> 20
            if (butunQism % 2 == 0) System.out.println(1);
            else System.out.println(-1);
        }
    }
}
