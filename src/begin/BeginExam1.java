package begin;

import java.util.Scanner;

public class BeginExam1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("");
       int a = scanner.nextInt();
        int v= a * a * a;
        int s=6*(a*a);
        System.out.println("Hajm:"+v);
        System.out.println("Yuza:"+s);
    }
}
