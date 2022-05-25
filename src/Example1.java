public class Example1 {
    public static void main(String[] args) {
        double x = 1.2;
        double fx;

/*
        if (x > 0) {
            fx = 2 * Math.sin(x);
            //
        } else {
            fx = x - 6;
        }
*/

        fx = (x > 0) ? 2 * Math.sin(x) : (x - 6);

        System.out.println(fx);
    }
}
