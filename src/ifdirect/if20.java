package ifdirect;

import java.util.Scanner;

public class if20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        System.out.println("1.a:");
        a= scanner.nextInt();
        System.out.println("2.b:");
        b= scanner.nextInt();
        System.out.println("3.c:");
        c= scanner.nextInt();
        int y=Math.abs(a-b);
        int g=Math.abs(a-c);


        if (y<g ){
            System.out.printf("A Nuqtaga Yaqin Nuqta b va ular orasida Masofa %d",y
            );
        }else if (g<y){
            System.out.printf("A Nuqtaga Yaqin Nuqta c va ular orasida Masofa %d",g);

        }else {
            System.out.println("A nuqtaga Ikkala nuqta bir xil masofada joylashgan");
        }
    }
}
