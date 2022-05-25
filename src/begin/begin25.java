package begin;

import java.util.Scanner;

public class begin25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("x=");
        int x=scanner.nextInt();
        int x1= 3* (int) Math.pow(x,6);
        int x2=6* (int) Math.pow(x,2);
        int y=x1-x2-7;
        System.out.println("Y="+y);
    }
}
