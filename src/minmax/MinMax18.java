package minmax;

import java.util.Scanner;

public class MinMax18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        int r;
        System.out.println("N:");
        n= scanner.nextInt();
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        int maxNum=0;
        int maxNum1=0;
        for (int i = 1; i <=n; i++) {
            System.out.print(i + ".");
            r = scanner.nextInt();
            if (max < r) {   // 5 10 2 9 0 10 6 10
                max = r;     //10
                maxNum = i; //2
            }
            if (max <= r) {   // 5 10 2 9 0 10 6
                maxNum1 = i;
            }
        }
            System.out.println(maxNum1-maxNum-1);

           }
}
