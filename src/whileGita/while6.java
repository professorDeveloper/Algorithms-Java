package whileGita;

import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("N:");
        n = scanner.nextInt();
        float rez = 1F;
        while (n >= 2)
        {
            rez *= n;
            n -= 2;
        }

        if (n%2==0){
            System.out.println("Juft");
        }else {
            System.out.println("Toq");
        }

    }
}
