package whileGita;

public class While29 {

    public static void main(String[] args) {
        solution(0.1); // 2
    }

    // e = 0.1
    public static void solution(double e) {
        double a1, a2 = 1, ak = 2;
        int k = 2; // k -> 2, 3, 4, 5, 6...
        do {
            a1 = a2;          // a1 =  1.666
            a2 = ak;          // a2 = 1.8666
            k++;              // 3
            ak = (a1 + 2 * a2) / 3;  // formula orqali ak topiladi
       //k=3 ak = 5/3=1.666
       //k=3 ak = 5/3=1.666
        } while (!(Math.abs(ak - a1) < e)); //1.8-1.666

        System.out.println(k); // 2

    }
}
