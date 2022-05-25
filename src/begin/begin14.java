package begin;

import java.util.Scanner;

public class begin14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("L:");
        int c = scanner.nextInt();
        int r= (int) (c/2*Math.PI);
        int s= (int) (Math.PI*Math.pow(r,2));
        System.out.println("Radius:"+r);
        System.out.println("Yuza:"+s);
    }
}
