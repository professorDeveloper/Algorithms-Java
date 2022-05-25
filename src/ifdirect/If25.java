package ifdirect;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x;
        System.out.print("x = ");
        x=scanner.nextInt();
        if (x<(-2)||x>2) {
            x = 2*x;
            System.out.print(x);
        }else {
            x=x*(-3);
            System.out.println(x);
        }
    }
}
