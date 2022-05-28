package integer;

import java.util.Scanner;

public class integer29 {
    public static void main(String[] args) {
        int A;
        int B;
        int R1,R2;
        int C;
        int K;
        Scanner scanner=new Scanner(System.in);
        System.out.print("A:");
        A = scanner.nextInt();

        System.out.print("B:");
        B = scanner.nextInt();


        System.out.print("C:");
        C = scanner.nextInt();

        R1 = A * B;
        R2 = C * C;
        K = R1 / R2;

        int qism= (int) ((A*B)-(K*Math.pow(C,2)));
        System.out.printf("Yuza:  %d\n",qism);///Joylashmay qolgan qismining yuzasi
        System.out.println("Kvadratlar soni: "+K);

    }
}
