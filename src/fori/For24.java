package fori;

public class For24 {

    public static void main(String[] args) {
        double x = Math.PI / 4; // 0<=x<=PI/2
        System.out.printf("%.10f\n", Math.cos(x));
        System.out.printf("%.10f", cos(20, x));
    }

    // cos(x) = x^0/0! - x^2/2! + x^4/4! - (-1)^n * x^(2n) / (2n)!
    public static double cos(int n, double x) {
        double sum = 1;
        double surat, maxraj;
        int ishora = -1;
        // n=10
        // 2 4 6 8 10
        for (int i = 1; i <= n; i++) {
            surat = Math.pow(x, 2 * i); // x^2
            maxraj = factorial(2 * i); // 2!
            sum += ishora * surat / maxraj;
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
    public static double factorial(int n) {
        double f = 1; //
        for (int i = 1; i <= n; i++) {
            f *= i; // 1*2*3*4*5*6*...*n
        }
        return f;
    }
}
