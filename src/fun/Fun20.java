package fun;

public class Fun20 {
    public static void main(String[] args) {
        System.out.printf("%.4f\n", TriangleP(3.0, 4.0));//c=5
        System.out.printf("%.4f\n", TriangleP(2.0, 3.0));
        System.out.printf("%.4f\n", TriangleP(5.0, 6.0));
    }
    public static double TriangleP(double a,double b){
        double c=Math.sqrt((a*a)+(b*b));
        double p=a+b+c;
        return p;
    }
}
