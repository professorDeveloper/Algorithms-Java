package whileGita;

public class While11 {
    public static void main(String[] args) {
        solution(10);
    }
    // 1+2+3+4+5...>=10
    public static void solution(int n) {
        int k = 0, sum = 0;
        do {
            sum += ++k; // 1
        } while (sum < n);

        System.out.println(k);
        System.out.println(sum);
    }
}
