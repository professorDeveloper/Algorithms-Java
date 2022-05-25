import java.util.Scanner;

public class boolean35 {
    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("1..8 x1 va y1 :");
            int x =scanner.nextInt();
            int y =scanner.nextInt();
            System.out.println("1..8 x2 va y2 :");
            int x2 =scanner.nextInt();
            int y2 =scanner.nextInt();
            boolean r=(((x+y)%2==1)==((x2+y2)%2==1))||(((x+y)%2==0)==((x2+y2)%2==0));
            System.out.println("Is success :"+r);

    }
}
