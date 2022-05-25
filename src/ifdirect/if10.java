package ifdirect;

import java.util.Scanner;

public class if10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("A:");
        int a= scanner.nextInt();
        System.out.println("b:");
        int b= scanner.nextInt();
        boolean booleans =a==b;
        if (booleans){
            int c=a+b;
            a=c;
            b=c;
            System.out.println(""+a);
            System.out.println(b);
        }else {
            System.out.println();
        }
    }
}
