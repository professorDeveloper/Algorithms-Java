package booleans;

import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c,d;
        boolean e;
        System.out.print(" A = ");//459 521
        a = scanner.nextInt();
        b = a/100;//4
        c = a/10%10;//5
        d =a%10;//9
        e = (b<c&&c<d)||(b>c&&c>d);// 4<5<9
        System.out.println(e);
    }
}
