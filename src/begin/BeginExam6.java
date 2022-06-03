package begin;

import java.util.Scanner;

public class BeginExam6 {
    public static void main(String[] args) {
        System.out.println("L:");
        Scanner scanner=new Scanner(System.in);
        int l= scanner.nextInt();
        int t1= (int) (2*Math.PI);
        int t2= (int) Math.sqrt(l/10);
        int t= t1*t2;
        System.out.println("T:"+t);

    }
}
