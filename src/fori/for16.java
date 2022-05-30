package fori;

import java.util.Scanner;

public class for16 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Sonni kiriting: ");
        double a= scanner.nextDouble();
        System.out.println("Sonning Darajasi: ");
        int n= scanner.nextInt();
        int result=1;
        for (int i = 1; i <=n ; i++) {
            result*=a;

        }
        System.out.println(result);


    }
}
