package fori;

import java.util.Scanner;

public class for35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("N:");
        float a1 = 1F;
        float a2 = 2F;
        float a3 = 3F;
        //
        ;
        float ak;
        for(int i = 4; i <= n; ++i)
        {
            ak = a3 + a2 - 2 * a1;
            System.out.printf("A(%d)=%f \n",i,ak);
            a1 = a2;
            a2 = a3;
            a3 = ak;
        }
        //
    }

}
