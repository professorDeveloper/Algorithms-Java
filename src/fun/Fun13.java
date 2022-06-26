package fun;

import java.util.Scanner;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/21/2022/ 2:07 PM
 */
public class Fun13 {


    static int a, b, c, d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        show(); // 3 2 3
        sort3();
        show(); // 2 3 3
    }

    // 2 9 7 2  -> 2 2 7 9
    // 9 1 6 3  -> 1 3 6 9
    // 6 1 9 4  -> 1 4 6 9
    // 9 6 1 -2 -> -2 1 6 9
    public static void sort3() {
        // avval dastlabki 2 tasi saralansin
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        } // a=2, b=9, c=7, d=2
        // keyingi 2tasi saralansin
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        } // a=2, b=7, c=9, d=2

        // keyingi 2tasi saralansin
        if (c > d) {
            int t = c;
            c = d;
            d = t;
        } // a=2, b=7, c=2, d=9

        // avval dastlabki 2 tasi saralansin
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        } // a=6, b=9, c=1
        // keyingi 2tasi saralansin
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        } // a=6, b=1, c=9


        // avval dastlabki 2 tasi saralansin
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        } // a=1, b=6, c=9
    }

    public static void show() {
        System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
    }
}
