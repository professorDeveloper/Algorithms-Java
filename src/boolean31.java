import java.util.Scanner;

public class boolean31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("A :");
        int a=scanner.nextInt();
        System.out.println("B:");
        int b=scanner.nextInt();
        System.out.println("C :");
        int c =scanner.nextInt();
        boolean r=((a+b)>c && (a-b)<c && (a==b || b==c || a==c));
        System.out.println(r);
    }
}
