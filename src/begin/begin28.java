package begin;

import java.util.Scanner;

public class begin28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int a2=a*a;
        int a3=a*a*a;
        int a5=a*a*a*a*a;
        int a10=a*a*a*a*a*a*a*a*a*a;
        int a15=a*a*a*a*a*a*a*a*a*a*a*a*a*a*a;
        System.out.printf("%d ning 2-kvadrati %d \n",a,a2);
        System.out.printf("%d ning 3-kvadrati %d \n",a,a3);
        System.out.printf("%d ning 5-kvadrati %d \n",a,a5);
        System.out.printf("%d ning 10-kvadrati %d \n",a,a10);
        System.out.printf("%d ning 15-kvadrati %d \n",a,a15);
    }
}
