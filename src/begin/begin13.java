package begin;

import java.util.Scanner;

public class begin13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("R1-raduis");
        int r1 = scanner.nextInt();
        System.out.println("R2-raduis");
        int r2 = scanner.nextInt();
        int s1= (int) (Math.PI*r1);
        int s2= (int) (Math.PI*r2);
        int s3=(int) Math.PI*(r1-r2);
        System.out.println("S1:"+s1);
        System.out.println("S2:"+s2);
        System.out.println("S3:"+s3);

    }
}
