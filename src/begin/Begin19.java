package begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ab;
        int ac;
        int s;
        int p;
        System.out.print("a=");
        ab = scanner.nextInt();
        System.out.print("b=");
        ac = scanner.nextInt();
        s = ac * ab;
        p = 2 * (ac + ab);
        System.out.print("s=");
        System.out.print(s);
        System.out.print("p=");
        System.out.print(p);

    }
}
