package fori;

public class For6 {

    public static void main(String[] args) {
        solution(1000);
    }

    public static void solution(double cost) {
        // 1.2   1.4    1.6 ... 2
        for (double i = 1.2; i <= 2.0; i += 0.2) {
            System.out.printf("%.2f\n", cost * i);
        }
    }
}
