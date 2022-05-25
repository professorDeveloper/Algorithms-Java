package ifdirect;

import java.util.Scanner;

public class if19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c,d,p=4;

        System.out.println("1.a:");
        a= scanner.nextInt();
        System.out.println("2.b:");
        b= scanner.nextInt();
        System.out.println("3.c:");
        c= scanner.nextInt();
        System.out.println("4.d:");
        d= scanner.nextInt();
        if (a==b && b==c){
            System.out.println(p);
        }else if (a==b && b==d){
            p--;
            System.out.println(p);

        }else if (a==c && c==d){
            p-=2;
            System.out.println(p);
        }   else if (b==c && c==d){
            p-=3;
            System.out.println(p);
        }


    }
}
