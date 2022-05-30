package fori;

import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        double rez=0;
        for  (int i =1; i<=n; i++)
            rez += Math.pow(-1,i+1)*(1.0+(double)i/10);

        System.out.print("Yig`indi:" + rez);
    }
}
