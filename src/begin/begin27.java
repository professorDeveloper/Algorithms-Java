package begin;

import java.util.Scanner;

public class begin27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int a2=a*a;
        int a4=a*a*a*a;
        int a8=a*a*a*a*a*a*a*a;
        System.out.printf("%d ning 2-kvadrati %d \n",a,a2);
        System.out.printf("%d ning 2-kvadrati %d \n",a,a4);
        System.out.printf("%d ning 2-kvadrati %d \n",a,a8);
    }
}
