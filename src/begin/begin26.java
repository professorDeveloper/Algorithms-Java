package begin;

import java.util.Scanner;

public class begin26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("x:");
        int x, x1,x2,y;
        System.out.print("x = ");
        x = scanner.nextInt();
        //x1=(x-3)^6; x2=(x-3)^3
        x1= (int) Math.pow((x-3),6);
        x2= (int) Math.pow((x-3),3);

        y=(4*x1)-7*(x2)+2;
        System.out.println("y = " + y);
    }
}
