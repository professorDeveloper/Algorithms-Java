package fun;

public class Fun5 {

    public static void main(String[] args) {
        rectPS(-2, 8, 6, -2);
    }

    // qarama-qarshi uchlari koordinatalari berilgan
    // yuza va perimeter topilsin
    // a = |x1-x2|; b = |y1-y2|
    // s = a*b
    // p = 2*(a+b)
    public static void rectPS(double x1, double y1, double x2, double y2) {
        double a = Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2);
        double s = a * b;
        double p = 2 * (a + b);

        System.out.println("s = " + s);
        System.out.println("p = " + p);
    }
}
