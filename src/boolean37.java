import java.util.Scanner;

public class boolean37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int x1,y1,x2,y2,a,b;
        boolean t;
        System.out.print ("x1=");//
        x1=scanner.nextInt ();
        System.out.print ("y1=");//
        y1=scanner.nextInt ();
        System.out.print ("x2=");//
        x2=scanner.nextInt ();
        System.out.print ("y2=");//
        y2=scanner.nextInt ();
        a=Math.abs (y1-y2);
        b=Math.abs (x1-x2);
        t=((x1==x2 && y1!=y2 && a==1))||((y1==y2 && x1!=x2 && b==1))||((x1!=x2 && y1!=y2 && (b==1) && a==1 ));
        System.out.println (t);
    }
}
