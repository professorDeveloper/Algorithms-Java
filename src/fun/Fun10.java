package fun;

public class Fun10 {
    public static void main(String[] args) {
        Swap(1, 2, 3, 4);
    }

    public static void Swap(int a, int b, int c, int d) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("c:" + c);
        System.out.println("d:" + d);
    }

}
