package fun;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/21/2022/ 12:27 PM
 */
public class Fun43 {
    public static void main(String[] args) {
        System.out.println("Ln: "+Ln(5,2));
    }
    public static double Ln(double x, double e ){//X-2
        double sum = 0;
        double surat, maxraj;
        int ishora = -1;//1

        for (int i = 1; i <=e; i++) {

            surat = Math.pow(x,i+1);
            maxraj = i+1;
            sum += ishora * (surat / maxraj);
            ishora *= -1;//
        }
        return sum;
    }
}


