import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        int N;
        int k = 0;
        Scanner scanner=new Scanner(System.in);
        int sun = 0;
        System.out.print(" N (>1): ");
        N = scanner.nextInt();
        while (sun < N)
        {++k;
            sun += k;


        }
        System.out.println("K= "+k);

    }
}
