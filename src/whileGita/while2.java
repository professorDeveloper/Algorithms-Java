package whileGita;

import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();

        int temp = a;
        int num = 0;
        while (temp - b >= 0)
        {
            temp -= b;
            ++num;
        }
        System.out.print(num);

}
}
