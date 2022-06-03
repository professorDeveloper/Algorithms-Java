package whileGita;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n;
        int k;
        System.out.print("N:");
        n = scanner.nextInt();
        System.out.print("K:");
        k = scanner.nextInt();

        int num = 0;
        while (n >= k)
        {
            n -= k;
            ++num;
        }
        System.out.println("Natija: "+num);

        System.out.print("Qoldiq:"+n);

    }
}
