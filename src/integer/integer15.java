package integer;

import java.util.Scanner;

public class integer15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.print("uch xonali sonni kiriting->");
        a = scanner.nextInt();
        b = a / 100;//yuzlar
        c = a - b * 100; //onlar
        d = c / 10;/*Birlar*/
        e = c - d * 10;
        f = b * 10 + d * 100 + e;
        System.out.print(" hosil bo'lgan son-> "+f);
    }
}
