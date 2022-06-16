package integer;

import java.util.Scanner;

public class integer17 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int a,b;

        System.out.print("to'rt xonali sonni kiriting->");
        a = scanner.nextInt() ;
        b = a % 1000 / 100;
        System.out.print(b);

    }
}
