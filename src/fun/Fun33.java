package fun;

public class Fun33 {
    public static void main(String[] args) {
        System.out.println(RadToDeg(4.2));
        System.out.println(RadToDeg(2.2));
        System.out.println(RadToDeg(3.2));
        System.out.println(RadToDeg(5.2));
        System.out.println(RadToDeg(8.2));

    }
    public static double RadToDeg(double r){

        double alfaRadian = Math.PI / r; // 90
        double alfaGradus = 360 / (2 * Math.PI) * alfaRadian;

        return alfaGradus;

    }
}
