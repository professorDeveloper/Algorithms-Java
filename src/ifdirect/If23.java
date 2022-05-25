package ifdirect;

import java.util.Scanner;

public class If23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        System.out.print("x1:");
        x1= scanner.nextInt();
        System.out.print("y1:");
        y1= scanner.nextInt();
        System.out.print("x2:");
        x2= scanner.nextInt();
        System.out.print("y2:");
        y2= scanner.nextInt();
        System.out.print("x3:");
        x3= scanner.nextInt();
        System.out.print("y3:");
        y3= scanner.nextInt();
        if (x2==x1 && y2==y3){
            System.out.print ("x4="+x3);
            System.out.print (" y4="+y1);
        }else System.out.println ("HATO");


    }
}
