package funsimple;

public class Fun12 {


    static int a, b, c;

    public static void main(String[] args) {
        a = 3;
        b = 2;
        c = 3;
        show(); // 3 2 3
        sort3();
        show(); // 2 3 3
    }

    // 2 9 7 -> 2 7 9
    // 9 1 6 -> 1 6 9
    // 6 1 9 -> 1 6 9
    // 9 6 1 -> 1 6 9
    public static void sort3() {
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
//        System.out.printf("%d, %d, %d\n", a, b, c);
        System.out.println(a + " " + b + " " + c);
    }
}
