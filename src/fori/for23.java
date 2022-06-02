package fori;

public class For23 {

    public static void main(String[] args) {
        double x = Math.PI / 3; // 0<=x<=PI/2
        System.out.printf("%.4f\n", Math.sin(x));
        System.out.printf("%.4f", sin(10, x));
    }

    // sin(x) = x - x^3/3! + x^5/5! - (-1)^n * x^(2n+1) / (2n+1)!
    public static double sin(int n, double x) {
//        x = parseX(x);
        double sum = x;
        double surat, maxraj;
        int ishora = -1;
        for (int i = 1; i <= n; i++) {
            surat = Math.pow(x, 2 * i + 1);
            maxraj = factorial(2 * i + 1); // 5! = 120
            sum += ishora * (surat / maxraj);
            ishora *= -1;//
        }
        return sum;
    }

    // keltirish formulalari orqali  0<=x<=PI/2 ge keltirish
/*
    public static double parseAlfa(double x) {

    }
*/


    // factorial hisoblanmoqda
    // n! = 1*2*3*4*..*n
    public static int factorial(int n) {
        int f = 1; //
        for (int i = 1; i <= n; i++) {
            f *= i; // 1*2*3*4*5*6*...*n
        }
        return f;
    }
}
