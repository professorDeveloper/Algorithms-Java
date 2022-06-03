package begin;

import java.util.Scanner;

public class BeginExam9 {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner=new Scanner(System.in);
        System.out.println("x:");
        x= scanner.nextInt();
        System.out.println("y:");
        y= scanner.nextInt();
        int natija=(Math.abs(x)-Math.abs(y))/(1+Math.abs(x)+Math.abs(y));
        System.out.println("Natija: "+natija);
    }
}

