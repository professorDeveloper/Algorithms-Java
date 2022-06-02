package fori;

public class For13 {

    public static void main(String[] args) {
        solution(3);
    }

    /**
     * @param n n>0 bo'lgan butun son
     *          1.1 - 1.2 + 1.3 - 1.4 + 1.5 + ... + n
     */
    public static void solution(int n) {
        double sum = 0; // summani hisoblash uchun
        int ishora = 1; // 1, -1
        for (double i = 1.1; i <= n; i += 0.1) {
            // i: 1.1, 1.2, 1.3, 1.4, 1.5... n
            sum += ishora * i; // -1 * 1.2
            ishora *= -1; // -1
        }

        System.out.println(sum);
    }
}
