package whileGita;

public class Example4 {

    public static void main(String[] args) {
        System.out.println(solution(64));
        System.out.println(solution2(64));
    }


    // 2 4 8 16 32 64 128 256 ...
    // 32 -> 2^k k=5
    public static int solution(int n) {
        int k = 1, degree = 0;
        do {
            k *= 2;   // 2  4  8  16  32  64
            degree++; // 1  2  3  4   5   6
        } while (k < 0);
        return degree;
    }

    public static int solution2(int n) {
        int k = 1, degree = 0;

        while (k < 0) {
            k *= 2;   // 2  4  8  16  32  64
            degree++; // 1  2  3  4   5   6
        }
        return degree;
    }
}
