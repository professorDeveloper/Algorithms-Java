package funsimple;

import java.util.Scanner;

public class Fun14 {


    static int a, b, c, d, f, e;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Abdulazizdan radix nima ekanligi so'ralsin
        // a = scanner.nextInt(radix);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        f = scanner.nextInt();
        e = scanner.nextInt();
        show(); // 3 2 3
        sort();
        show(); // 2 3 3
    }

    // 2 8 7 2 10 8 10 4 19 6   ->  2 9

    // 9 1 6 3 -6  -> -6 1 3 6 9
    // 6 1 9 4  16 -> 1 4 6 9 16
    // 9 6 1 -2 5 -> -2 1 5 6 9

    public static void sort() {
        sort6(); //
        sort5(); //
        sort4();
        sort3();
        sort2();
    }

    public static void sort6() {
        sort5();
        // keyingi 2tasi saralansin
        if (f > e) {
            int t = f;
            f = e;
            e = t;
        }
    }

    public static void sort5() {
        sort4();
        // keyingi 2tasi saralansin
        if (d > f) {
            int t = d;
            d = f;
            f = t;
        } // a=2, b=7, c=2, d=9

    }

    public static void sort4() {
        sort3();
        // keyingi 2tasi saralansin
        if (c > d) {
            int t = c;
            c = d;
            d = t;
        } // a=2, b=7, c=2, d=9
    }

    public static void sort3() {
        sort2();
        // keyingi 2tasi saralansin
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        } // a=2, b=7, c=9, d=2

    }

    public static void sort2() {
        // avval dastlabki 2 tasi saralansin
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        } // a=2, b=9, c=7, d=2
    }

    public static void show() {
        System.out.printf("%d, %d, %d, %d, %d, %d\n", a, b, c, d, f,e);
    }
}
