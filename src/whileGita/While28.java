package whileGita;

public class While28 {

    public static void main(String[] args) {
        solution(0.1); // 2
    }

    // e = 0.1
    public static void solution(double e) {
        double a1, ak = 2;
        int k = 1; // k > 2, 3, 4, 5, 6...
        do {
            a1 = ak;          // a1=2.5
            k++;              // 2
            ak = 2 + 1 / a1;  // formula orqali ak topiladi
            //ak = 2.5, a1=2
        } while (!(Math.abs(ak - a1) < e));

        System.out.println(k); // 2

    }
}
