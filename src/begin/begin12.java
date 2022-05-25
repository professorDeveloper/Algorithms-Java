package begin;

import java.util.Scanner;

public class begin12 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("a-katet");
        int a = scanner.nextInt();
        System.out.println("b-katet");
        int b = scanner.nextInt();
        int c= (int) Math.sqrt(Math.pow(a,2)*Math.pow(b,2));
        int p=a+b+c;
        System.out.println("Gipotenuza: "+c);
        System.out.println("Perimetr: "+p);
    }
}
