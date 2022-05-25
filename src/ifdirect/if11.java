package ifdirect;

import java.util.Scanner;

public class if11 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1-son:");
         a= scanner.nextInt();
        System.out.println("2-son:");

         b=scanner.nextInt();
         if (a!=b){
             if (a < b) {
                 a=b;

             } else {

                 b=a;
             }
         }else {
             a=0;
             b=0;
         }
        System.out.println(b);
        System.out.println(a);

    }
}
