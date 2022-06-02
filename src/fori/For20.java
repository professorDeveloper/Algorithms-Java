package fori;

import java.util.Scanner;

public class For20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long s = solution(n); // 1!+2!+..+
        System.out.println(s);
    }

    //    a + b
    //    a,b => -10^100 .. 10^100

    // 5! = 1*2*3*4*5
    // 5! = 5*4! = 5*24=120
    // 4! = 4*3! = 4*6 = 24
    // 3! = 3*2! = 3*2=6
    // 2! = 2*1! = 2
    // 1! = 1

    // sum = 1!+2!+3!+4!+...+n!
    public static long solution(long n) {
        long s = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            s += factorial;
        }
        return s;
    }
}
