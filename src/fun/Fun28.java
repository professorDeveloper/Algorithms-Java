package fun;

public class Fun28 {
    public static void main(String[] args) {
        System.out.println(tub(2));
        System.out.println(tub(3));
        System.out.println(tub(4));
        System.out.println(tub(5));
        System.out.println(tub(6));
        System.out.println(tub(7));
    }

    // n = 51
    // 2 3 4 5 ... 50
    public static boolean tub(int number) {
        int i = 2;//4
        while (i < number) {
            if (number % i == 0)
                return false; // tub emas
            i++;
        }
        return true; // tub
    }
}
