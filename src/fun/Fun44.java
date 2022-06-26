package fun;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/21/2022/ 12:50 PM
 */
public class Fun44 {
    public static void main(String[] args) {
        Arctg(4.2, 5.1);
    }

    public static double Arctg(double x, double e) {
        double sum = 0;
        double surat, maxraj;
        int ishora = -1;//1

        for (int i = 1; i <= e; i++) {

            surat = Math.pow(x, 2 * i + 1);
            maxraj = 2 * i + 1;
            sum += ishora * (surat / maxraj);
            ishora *= -1;//
        }
        return sum;
    }
}
