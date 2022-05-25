import java.util.Scanner;

public class boolean39 {
    public static void main(String[] args) {
        boolean x11,y11,x22,y22;

        Scanner scanner=new Scanner(System.in);
        System.out.println("x1 :");
        int x1=scanner.nextInt();
        System.out.println("y1 :");
        int y1=scanner.nextInt();
        System.out.println("x2 :");
        int x2=scanner.nextInt();
        System.out.println("y2 :");
        int y2=scanner.nextInt();
       int a=Math.abs (y1-y2);
        x11=(0<x1)&&(x1<=8);
        y11=(0<y2)&&(y1<=8);
        x22=(0<x2)&&(x2<=8);
        y22=(0<y2)&&(y2<=8);
       int b=Math.abs (x1-x2);

        System.out.println(true);
    }
}
