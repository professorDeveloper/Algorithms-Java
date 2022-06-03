package begin;

import java.util.Scanner;

public class BeginExam2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c1=(int) (a*a)+(b*b);
        int c= (int) Math.sqrt(c1);
        int s=(a*b)/2;
        System.out.println("Yuza:"+s);
        System.out.println("Gipotenuza:"+c);
    }
}
