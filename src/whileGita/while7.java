package whileGita;

import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);

        int k = 1;
        System.out.print(" n (>0): ");
	n= scanner.nextInt();
	while (k * k < n)
        { ++k;
        }
        System.out.printf("Kvadrati %d dan katta bo'lgan eng kichik musbat butun son: %d ",n,k);

    }
}
