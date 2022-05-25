import java.util.Scanner;

public class Masala6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,x2, y1, y2, d;
        System.out.print("x1 =");
        x1 = scanner.nextInt();

        System.out.print("x2 =");
        x2 = scanner.nextInt();


        System.out.print("y1 =");
        y1 = scanner.nextInt();

        System.out.print("y2 =");
        y2 = scanner.nextInt();

        d =Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));

        System.out.println("D =" +d);







    }
}
