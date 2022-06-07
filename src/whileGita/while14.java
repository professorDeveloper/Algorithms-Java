package whileGita;

import java.util.Scanner;

public class while14 {
    public static void main(String[] args) {
        float a;
        Scanner scanner=new Scanner(System.in);

        System.out.print("A:");
        a = scanner.nextInt();
        int k = 0;
        float temp = 0F;
        while (temp <= a)
        {
            ++k;
            temp += 1 / (float)k;
        }
        System.out.print("K:");
        System.out.print(k - 1);
        System.out.print("\n");
        System.out.print("Nsum:");
        System.out.print(temp - 1 / (float)k);

    }
}
