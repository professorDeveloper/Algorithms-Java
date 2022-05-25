import java.util.Scanner;

public class boolean24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("A :");
        int a=scanner.nextInt();
        System.out.println("B:");
        int b=scanner.nextInt();
        System.out.println("C :");
        int c =scanner.nextInt();
        boolean d=((b*b)-4*(a*c))>0;

        System.out.println(d);
    }
}
