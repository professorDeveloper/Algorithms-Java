package fun;

public class Fun42 {
     public static void main(String[] args) {
         System.out.println(Cos1(5,10));

    }
    public static double Cos1(double x, double e){
            double sum = 1;
            double surat, maxraj;
            int ishora = -1;
            // n=10
            // 2 4 6 8 10
            for (int i = 1; i <= e; i++) {
                surat = Math.pow(x, 2 * i); // x^2
                maxraj = foctarial(2 * i); // 2!
                sum += ishora * surat / maxraj;
                ishora *= -1;//
            }
            return sum;
        }



    public static int foctarial(int n){
         int f=1;
        for (int i = 1; i <=n; i++) {

            f*=i;
        }
        return f;
    }
}
