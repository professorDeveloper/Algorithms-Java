package integer;

import java.util.Scanner;

import static java.lang.System.in;

public class integer27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        int K;

        System.out.println("1-yanvar yakshanba ");
        System.out.print("K:");
        K = scanner.nextInt();


        System.out.printf("Hafata kuni raqami: %d\n",((K + 5) % 7) + 1);

    }
}
