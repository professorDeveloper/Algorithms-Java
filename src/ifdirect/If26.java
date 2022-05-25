package ifdirect;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int x,fx;
        System.out.print ("X:");
        x=scanner.nextInt ();
        if (x<=0){
            fx=x*(-1);
            System.out.println (fx);
        } else if (0<x && x<2) {
            fx= (int) Math.pow(x,2);
            System.out.println (fx);
        } else if (x>=2) {
            fx=4;
            System.out.println (fx );
        }

    }
}
