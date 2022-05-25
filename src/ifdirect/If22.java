package ifdirect;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int x,y;
        System.out.print ("X: ");
        x=scanner.nextInt ();
        System.out.print ("Y: ");
        y=scanner.nextInt ();
        if (x>0 && y>0){
            System.out.println ("1-Chorak");
        } else if (x<0 && y>0) {
            System.out.println ("2-chorak");
        } else if (x<0 && y<0 ) {
            System.out.println ("3-chorak");
        } else if (x>0 && y<0) {
            System.out.println ("4-chorak");
        }
    }
}
