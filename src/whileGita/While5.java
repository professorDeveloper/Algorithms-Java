package whileGita;

public class While5 {

    public static void main(String[] args) {
        System.out.println(solution(64));  // 6
        System.out.println(solution2(64)); // 6
    }

    // 2 4 8 16 32 64 128 256 ...
    // 32 -> 2^k k=5
    public static int solution(int n) {
        int k = 0;
        while (n > 1) {
            n = n / 2; // n=1
            k++;
        }
        return k;
    }

    // 2 4 8 16 32 64 128 256 ...
    // 32 -> 2^k k=5
    public static int solution2(int n) {
        int k = 1, degree = 0;
        while (k < n) {
            k *= 2;   // 2  4  8  16  32  64
            degree++; // 1  2  3  4   5   6
        }
        return degree;
    }
}
