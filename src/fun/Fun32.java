package fun;

public class Fun32 {
    public static void main(String[] args) {
        System.out.println(DegToRad(4.3));
        System.out.println(DegToRad(2.4));
        System.out.println(DegToRad(5.1));
        System.out.println(DegToRad(1.1));
        System.out.println(DegToRad(6.1));
    }
    public static double DegToRad(double d){
        double PI = 3.1415;
        double alfaGradus = d;// ~1.57
        double alfaRadian = 2 * PI * alfaGradus / 360;


        return alfaRadian;


    }
}
