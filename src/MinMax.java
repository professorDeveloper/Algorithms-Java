import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int n;
        int r;
        int min = 0;
        int minnum=0;
// 3 5 2 4 1
        System.out.println("N:");
        n= scanner.nextInt();
        //
        for (i = 1; i <= n; ++i) {
            System.out.print(i+"-");
            r= scanner.nextInt();
            //
            if ((r < min) || (i == 1)) {
                min = r;
                minnum = i-1;
            }
        }
        System.out.println("Minimum:"+minnum);
    }
}
