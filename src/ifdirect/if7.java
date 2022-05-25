package ifdirect;

import java.util.Scanner;

public class if7 {
    public static void main(String[] args) {
        int a,b,p=2;
        Scanner scanner =new Scanner(System.in);
        System.out.println("1-son:");
        a=scanner.nextInt();
        System.out.println("2-son:");
        b=scanner.nextInt();
        if (a< b){
            p--;
            System.out.println(p);
        }else if (b<a){
            System.out.println(p);
        }else {
            System.out.println("Ikkalasi ham teng");
        }
    }
}
