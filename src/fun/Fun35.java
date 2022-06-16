package fun;

public class Fun35 {
    public static void main(String[] args) {
        Fact(5);
        Fact(4);
        Fact(6);
    }

    public static void Fact(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f * 2);
    }
}
