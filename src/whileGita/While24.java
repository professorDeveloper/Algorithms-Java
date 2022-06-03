package whileGita;

public class While24 {

    public static void main(String[] args) {
        if (solution(22)) System.out.println("Mavjud");
        else System.out.println("Mavjud emas");


    }

    public static boolean solution(int n) {
        // 1 1 2 3 5 8 13 21
        int f1 = 1, f2 = 1, fn;
        do {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        } while (fn < n);
        return fn==n;
    }
}
