package fori;

import java.util.Scanner;

import static java.lang.System.in;

public class for17 {
    public static void main(String[] args) {

//        solution(4, 0);
        solution(3, 1.5);
    }

    // a^0 + a^1 + a^2 +....+ a^n
    public static void solution(int n, double a) {
        double s = 0;
        double daraja = 1;
        for (int i = 0; i <= n; i++) { // i=2
            s += daraja; // a^0, a^1, a^2 a^3 ...
            daraja *= a;
        }
        System.out.printf("%.2f", s);

    }
}
