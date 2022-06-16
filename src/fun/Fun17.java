package fun;

public class Fun17 {

    public static void main(String[] args) {
//        solution(1,-5,6); // 2 3
//        solution(4,4,1); // -0.5
        solution(1, 5, 15); //

    }

    /**
     * ax^2+bx+c=0
     * a,b,c - berilgan
     * ildizlari topilsin.
     * d = b*b - 4*a*c;
     * agar d>0 bo'lsa, 2 ta ildizga ega      x^2-5x+6=0 -> x1=2, x2=3
     * x1 = (-b+sqrt(d))/2a
     * x2 = (-b-sqrt(d))/2a
     * agar d=0 bo'lsa, 1 ta ildizga ega      4x^2+4x+1=0  -> -0.5
     * x = -b / 2a
     * d<0 ildizga ega emas      x^2+5x+15=0  -> ildizga ega emas
     */

    public static void solution(double a, double b, double c) {
        double disk = b * b - 4 * a * c;
        if (disk > 0) {
            double x1 = (-b + Math.sqrt(disk)) / (2 * a);
            double x2 = (-b - Math.sqrt(disk)) / (2 * a);
            System.out.printf("x1=%.2f  x2=%.2f", x1, x2);
        } else if (disk == 0) {
            double x = -b / (2 * a);
            System.out.printf("x=%.2f", x);
        } else {
            System.out.println("Ildizga ega emas");
        }
    }
}
