package fun;

public class Fun14 {
    public static void main(String[] args) {
        g (3, 4, 5);//5=c 3=a 4=b
        g (3, 4, 5);//5=c 3=a 4=b
    }

    public static void g(int a, int b, int c) {
        int d;
        d = c;//5
        c = b;//4
        b = a;//3
        a = d;//5

        System.out.print (a);
        System.out.print (b);//3
        System.out.println (c);
    }
}
