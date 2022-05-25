package begin;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("A:");
        int a=scanner.nextInt();
        int v= (int) Math.pow(a, 3);
        int s = (int) (6*Math.pow(a,2));
        System.out.println("Hajm:"+v);
        System.out.println("Sirti:"+s);
    }
}
