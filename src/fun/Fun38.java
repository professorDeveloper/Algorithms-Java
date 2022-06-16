package fun;

public class Fun38 {
    public static void main(String[] args) {
        System.out.println(Power2(5, 0));
        System.out.println(Power2(-5, 4));//-5*-5*-5*-5
        System.out.println(Power2(5, 2));//-5*-5*-5*-5
    }

    public static double Power2(double a, double n) {
        float result=1f;
        double y = 1;
        if (n > 0) {

            for (int i = 1; i <= n; ++i)
            {
                result *= a;
            }
        } else if (a<0){

            for (int i = 1; i <= n; ++i)
            {
                result *= a;
            }
        }

        return result;
    }

}
