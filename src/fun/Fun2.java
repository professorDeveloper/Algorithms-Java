package fun;

public class Fun2 {
    private static double a3;

    public static void main(String[] args) {
        PowerA2 (2,3,4);
    }

    public static void PowerA2(double a,double b,double c) {
        double a2,a3,a4;
        double b2,b3,b4;
        double c2,c3,c4;
        a2=a*a; a3=a*a*a; a4=a*a*a*a;
        b2=b*b; b3=b*b*b; b4=b*b*b*b;
        c2=c*c; c3=c*c*c; c4=c*c*c*c;
        System.out.println ("a ning 2 3 4 darajalari =>"+a2+"=> "+a3+"=> "+a4);
        System.out.println ("b ning 2 3 4 darajalari =>"+b2+"=> "+b3+"=> "+b4);
        System.out.println ("c ning 2 3 4 darajalari =>"+c2+"=> "+c3+"=> "+c4);
    }

}
