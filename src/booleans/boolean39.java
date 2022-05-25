package booleans;

import java.util.Scanner;

public class boolean39 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int x1,y1,x2,y2,a,b;
//       =><->(){}:
        boolean t,x11,y11,x22,y22;
        System.out.print ("x1=");//
        x1=scanner.nextInt ();
        System.out.print ("y1=");//
        y1=scanner.nextInt ();
        System.out.print ("x2=");//
        x2=scanner.nextInt ();
        System.out.print ("y2=");//
        y2=scanner.nextInt ();
        x11=(0<x1)&&(x1<=8);
        y11=(0<y2)&&(y1<=8);
        x22=(0<x2)&&(x2<=8);
        y22=(0<y2)&&(y2<=8);
        a=Math.abs (y1-y2);
        b=Math.abs (x1-x2);
        t=((x11 && y11 && x22 && y22))&&((x1==x2 && y1!=y2)||(x1!=x2 && y1==y2))||a==b;
        System.out.println (t);

    }
}
