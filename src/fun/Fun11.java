package fun;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/21/2022/ 2:03 PM
 */
public class Fun11 {

    static int a, b;

    public static void main(String[] args) {
        a = 8;
        b = 7;
        show();
        sort2();
        show(); // 7, 8
    }

    public static void sort2() {
        if (a > b) swap();
    }

    public static void swap() {

        a = a + b; // a = 15
        b = a - b; // b = 7
        a = a - b; // a = 8
    }

    public static void show() {
        System.out.printf("%d, %d\n", a, b);
    }
}

