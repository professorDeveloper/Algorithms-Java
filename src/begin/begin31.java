package begin;

import java.util.Scanner;

public class begin31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tf;
        System.out.print("Tf:");
        tf= scanner.nextInt();
        int tc;
        tc = (tf - 32) * 5 / 9;

        System.out.printf("%d\n", tc);
    }
}
