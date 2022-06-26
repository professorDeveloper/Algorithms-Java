package fun;

public class Fun4 {

    public static void main(String[] args) {
        triangle(4); //  test1  a = 4 -> p=12; s=4*sqrt(3);
        triangle(3); //  test1  a = 4 -> p=12; s=4*sqrt(3);
        triangle(-3); //  test1  a = 4 -> p=12; s=4*sqrt(3);
    }

    /**
     * a - t.tomonli uchburchak tomoni
     * p = a+a+a = 3*a;
     * s = a*a*sqrt(3)/4;
     */
    public static void triangle(double a) {
        if (a > 0) {
            double p = 3 * a; // perimeter
            double s = a * a * Math.sqrt(3) / 4;
            // f-haqiqiy
            // d-butun son
            // s-string
            System.out.printf("P = %.2f, S = %.2f\n", p, s);
        } else {
            System.out.println("Uchburchak tomoni xato kiritildi.");
        }
    }
}
