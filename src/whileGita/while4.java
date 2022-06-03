package whileGita;

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a;
        System.out.print("A:");
        a = scanner.nextInt();
        while (a > 0)
        {
            a -= 3;
        }
        if (a == 0)
        {
            System.out.print("3-ning darajasi");
        }
        else
        {
            System.out.print("3-ning darajasi emas");
        }


    }
}
