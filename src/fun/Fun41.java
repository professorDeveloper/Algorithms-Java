package fun;

public class Fun41 {
    public static void main(String[] args) {
       System.out.println(Exp(56,5));
    }
    public  static double Exp(double x, double z ){
            double sum = 0;
            double surat, maxraj;
            int ishora = 1;
            // double x1=Math.abs(x);
            // n=10
            // 2 4 6 8 10
            for (int i = 1; i <=x; i++) {

                surat = Math.pow(x,2*i+1); // /x/*n
                maxraj =factorial (2*i+1); // n
                sum += ishora * (surat / maxraj);
                ishora *= -1;//
            }
            return sum;
        }
    public static int factorial(int n) {
        int f = 1; //
        for (int i = 1; i <= n; i++) {
            f *= i; // 1*2*3*4*5*6*...*n
        }
        return f;
    }
    }


