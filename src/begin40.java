import java.util.Scanner;

public class begin40 {
    public static void main(String[] args) {
        int a1, a2, b1, b2, c1, c2, d, x, y;
        Scanner scanner = new Scanner(System.in);
        //a1=4, a2=2, b1=6,b2=3 ,c1=5, c2=7
        a1 = scanner.nextInt();
        a2 = scanner.nextInt();
        b1 = scanner.nextInt();
        b2 = scanner.nextInt();
        c1 = scanner.nextInt();
        c2 = scanner.nextInt();
        d = ((a1 * b2) - (a2 * b1));//d=0
        if (d != 0) {
            x = ((c1 * b2) - (c2 * b1)) / d;//x=-15
            y = ((a1 * c2) - (a2 * c1)) / d;//y=8
            System.out.printf("x=%d \n",x);
            System.out.printf("y=%d \n",y);
        }else {
            System.out.println("Tenglama Yechimga ega emas !");
        }

    }
}
