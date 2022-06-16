package funsimple;

public class Fun11 {

    static int a, b;

    public static void main(String[] args) {
        a = 8;
        b = 7;
        show();
        sort2();
        show(); // 7, 8
    }

    // o'sish tartibida
    public static void sort2() {
        if (a > b) swap();
    }

    // ikki sonni o'rnini almashtirish
    public static void swap() {
        int t = a;
        a = b;
        b = t;
        /*
        a = a + b; // a = 15
        b = a - b; // b = 7
        a = a - b; // a = 8
*/
    }

    public static void show() {
        System.out.printf("%d, %d\n", a, b);
    }
}
