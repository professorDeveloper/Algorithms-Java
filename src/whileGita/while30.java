package whileGita;

import java.util.Scanner;

public class while30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a;
        float b;
        float c;
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();
        System.out.print("C:");
        c = scanner.nextInt();

        int k = 0;
        float temp;
        while ((a - c) >= 0)
        {
            a -= c;
            temp = b;
            while (temp - c >= 0F)
            {
                temp -= c;
                ++k;
            }
        }
        System.out.print("Kvadrat Sig`imi:");
        System.out.print(k);

    }
}
