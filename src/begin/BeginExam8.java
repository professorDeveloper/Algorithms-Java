package begin;

import java.util.Scanner;

public class BeginExam8 {
    public static void main(String[] args) {
        int r1,r2,r3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("R1:");
        r1= scanner.nextInt();
        System.out.println("R2:");
        r2= scanner.nextInt();
        System.out.println("R3:");
        r3= scanner.nextInt();
        int r=(r1*r2*r3)/((r1*r2)+(r1*r3)+(r2*r3));
        System.out.println("R:"+r);
    }
}
