package fun;

public class Fun39 {
    public static void main(String[] args) {
        System.out.println(Power3(2, 2));
        System.out.println(Power3(2, 2.5));
    }

    public static double Power3(double a, double n) {
        int d = (int) (n / 1);
        if (n - d == 0) return Power1((int) a, (int) n);
        else  return Power2(a, n);
    }

    public static int Power1(int a, int b) {
      int result=1;
        if (b > 0) {

            for (int i = 1; i <= b; ++i) {
                result *= a;
            }
        } else if (a < 0) {

            for (int i = 1; i <= b; ++i) {
                result *= a;
            }
        }



        return result;
    }

    public static double Power2(double a, double n) {
        double pow = 0;

        pow = Math.pow(a, n);

        return pow;
    }
}
