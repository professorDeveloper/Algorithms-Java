package fori;

class for17 {

    public static void main(String[] args) {
//        solution(4, 0);
        pow(1.5, -1);
        System.out.println(Math.pow(1.5, -1));
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

    // a*a*a*a*a*a
    public static void pow(double a, int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f *= a;
        }
        System.out.println(f);
    }
}
