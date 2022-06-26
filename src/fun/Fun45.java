package fun;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/21/2022/ 13:30 PM
 */
public class Fun45 {
    public static void main(String[] args) {
        System.out.println(Power4(3, 5, 6));
    }

    public static double Power4(double x, double a, double e) {
        double s;
        double mh;
      double  kp;

        int ayirsh = -1;
        double summa = 0;

        for (int i = 0; i < e; i++) {
            kp = (ayirsh - i + 1);
            s = (x * i);
            mh = factorial(i);
            double bolish = (s / mh);
            summa = ayirsh * kp * bolish;
            ayirsh *= -1;

        }
        return summa;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {

            f *= i;
        }
        return f;
    }


}
