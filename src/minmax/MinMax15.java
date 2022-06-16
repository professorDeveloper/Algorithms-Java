package minmax;

import java.util.Scanner;

public class MinMax15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("b= ");
        int b= scanner.nextInt();
        System.out.print("c=");
        int c= scanner.nextInt();
        // boolean katta = false;
        int min =Integer.MAX_VALUE;
        int index=0;
        int a=0, d = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+"-");
            int number = scanner.nextInt();//10ta sonni kiritish uchun
            if ( number>b && number<c){
                if (  min >number)min=number;
                // katta=true;
                index=i;

            }

        }

        if (index>0)System.out.println(index);
        else System.out.printf("%d  %d ", a, d);
    }
}