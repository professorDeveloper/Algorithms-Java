import java.util.Scanner;

public class boolean29 {
    public static void main(String[] args) {
        int x,y,y1,x1,y2,x2;
        Scanner scanner=new Scanner(System.in);
        boolean m;
        System.out.println("x");
        x= scanner.nextInt();
        System.out.println("y:");
        y= scanner.nextInt();
        System.out.println("x1:");
        x1=scanner.nextInt();
        System.out.println("y1:");
        y1=scanner.nextInt();
        System.out.println("x2:");
        x2= scanner.nextInt();
        System.out.println("y2");
        y2= scanner.nextInt();
        m=((x>x1) && (x2>x) &&(y1>y) && (y>y2));
        System.out.println(m);
    }
}
