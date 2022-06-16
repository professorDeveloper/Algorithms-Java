package fun;

public class Fun37 {
    public static void main(String[] args) {
        System.out.println(Power1(2.3, 2.3));//A1
        System.out.println(Power1(1, 2.3));//A2
        System.out.println(Power1(5, 2.3));//A3
//        System.out.println(Power2(2.3, 2.3));
    }//2.3

    public static double Power1(double a, double b) {
        double pow = 0;

        pow = Math.pow(a, b);
        return pow;
    }

//    public static double Power2(double a, double b) {
//        double f = 1;
//        for (int i = 1; i <= b; i++) {
//            f *= a;
//        }
//
//        return f;
//    }
}
