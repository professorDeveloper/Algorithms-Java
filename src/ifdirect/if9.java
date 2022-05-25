package ifdirect;

import java.util.Scanner;

public class if9 {
    public static void main(String[] args) {





                Scanner scanner =new Scanner(System.in);
        System.out.println("A :");
        int a =scanner.nextInt();
        System.out.println("B :");
        int b =scanner.nextInt();
        if (a>b){
            a=13;
            b=18;
        }
        else {
            b=13;
            a=18;
        }
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}
