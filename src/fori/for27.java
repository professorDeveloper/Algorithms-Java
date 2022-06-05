package fori;

import java.util.Scanner;

public class for27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        float a;
        float min = Integer.MAX_VALUE;
        float minnum = 0;
        float max = 0;
        int n;
        System.out.print("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print(i + "-");
            a = scanner.nextInt();

            if (  (a < min)) {
                min = a;
                minnum = i;
            }


        }
        System.out.println("Element Raqami:"+minnum);
        System.out.println("Eng kichik son: "+min);


    }
}
