package begin;

import java.util.Scanner;

public class begin15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yuza:");
        int c=scanner.nextInt();
        int r= (int) (c/2*Math.PI);
        int d=r*r;
        System.out.println("Diametr: "+d);
        System.out.println("Raduis: "+r);
    }
}
