package whileGita;

public class Example5 {

    public static void main(String[] args) {
//        System.out.println((int) Math.sqrt(997));
        tubNumber(1000);
    }


    // 2 3 5 7 11 13 17 19 23 29 ...
    public static void tubNumber(int n) {
        for (int i = 2; i <= n; i++) {
            if (tub(i)) System.out.print(i + " ");
        }
    }

    // n
    // 1 2 3 4 5 ... sqrt(n)
    public static boolean tub(int number) {
        int i = 2;
        while (i < Math.sqrt(number)) {
            if (number % i == 0)
                return false; // tub emas
            i++;
        }
        return true; // tub
    }
}
