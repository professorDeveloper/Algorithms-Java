package fori;

import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; ++i)
        {
            sum += i;
        }
        System.out.print("Sonlar Yig`indisi = "+sum);
    }
}
