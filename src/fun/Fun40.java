package fun;

public class Fun40 {
    public static void main(String[] args) {
        System.out.println(Exp1(4, 3));
        System.out.println(Exp1(5, 3));
        System.out.println(Exp1(6, 3));
    }
    public static double Exp1(int z, double x) {
        double sum = 1; // sum + x^i/i! + x^2/2! + x^3/3! + ...
        int factorial = 1;
        double pow = x;
        if (z>0){
            for (int i = 1; i <= z; i++) {
                // pow = x^i
                // factorial = i!
                sum += pow / factorial;
                factorial *= i;
                pow *= x; // x * x
            }
        }

        return sum;
    }
}
