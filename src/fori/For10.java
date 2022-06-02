package fori;

public class For10 {

    public static void main(String[] args) {
        solution(4);
    }

    // s = 1 + 1/2 + 1/3 +1/4+...+ 1/n;
    public static void solution(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println(s);
    }
}
