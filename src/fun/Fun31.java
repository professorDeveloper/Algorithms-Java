package fun;

public class Fun31 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(2112));
        System.out.println(isPalindrome(99));
        System.out.println(isPalindrome(21));
        System.out.println(isPalindrome(2121));

    }

    public static boolean isPalindrome(int n) {//101

        int num = n; //
        int temp;
        int reverseNum = 0;

        for (; num != 0; ) {
            temp = num % 10;
            reverseNum = reverseNum * 10 + temp;

            num = num / 10;
        }

        if (n == reverseNum) return true;
        else return false;



    }
}
