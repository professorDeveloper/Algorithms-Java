package fori;

public class For22 {
    public static void main(String[] args) {
        double result = solution(3,0.5);
        System.out.println(result);

        // 1 + 0.5/1! + 0.5^2/2! + 0.5^3/3!
    }

    public static double solution(int n, double x) {
        double sum = 1; // sum + x^i/i! + x^2/2! + x^3/3! + ...
        int factorial = 1;
        double pow = x;
        for (int i = 1; i <= n; i++) {
            // pow = x^i
            // factorial = i!
            sum += pow / factorial;
            factorial *= i;
            pow *= x; // x * x
        }
        return sum;
    }
}
