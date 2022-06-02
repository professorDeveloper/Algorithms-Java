package fori;

public class For1 {

    public static void main(String[] args) {

        solution(5, 10);
    }

    public static void solution(int k, int n) {
        // k sonini n marta chop etilsin
        for (int i = 1; i <= n; i++) {
            System.out.print(String.format("%d: %d\n", i, k));
        }
    }
}
