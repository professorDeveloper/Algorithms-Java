package whileGita;

import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);

        int k = 1;
        System.out.print(" n (>0): ");
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
	n= scanner.nextInt();
	while (k * k <= n)
        { ++k;
        }
        System.out.printf("Kvadrati %d dan katta bo'lgan eng kichik musbat butun son: %d ",n,k);

    }
}
