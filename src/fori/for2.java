package fori;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);

        System.out.print("A:");
        a = scanner.nextInt();

        System.out.print("B:");
        b = scanner.nextInt();


        for (int i =a; i <= b; ++i)
        {
            System.out.println(i);
        }
        System.out.print("Sonlar soni: ");
        System.out.print(b - a + 1);
    }


}
