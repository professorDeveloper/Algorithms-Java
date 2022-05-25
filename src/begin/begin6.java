package begin;

import java.util.Scanner;

public class begin6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("D:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int v = a*b*c;
        int s =2* (a*b+b*c+a*c);
        System.out.println("Hajm:"+v);
        System.out.println("sirt:"+s);

    }
}
