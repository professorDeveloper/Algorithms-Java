package begin;

import java.util.Scanner;

public class begin7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("R:");
        int r=scanner.nextInt();
        int l= (int) (r*Math.PI);
        int s= (int) (Math.pow(r,2)*Math.PI);

        System.out.println("L:"+l);
        System.out.println("S:"+s);

    }
}
