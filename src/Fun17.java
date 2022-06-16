public class Fun17 {
    public static void main(String[] args) {
        solution(4.0,-4.0,1.0);
    }
    public static void solution (double a,double b, double c){
            float D;
            D = (float) (Math.pow(b,2) - 4 * a * c);

            if (D>0){
                float x1;
                float x2;
                x1 = (float) (((-1) * b + Math.sqrt(D)) / (2 * a));
                x2 = (float) (((-1) * b - Math.sqrt(D)) / (2 * a));
                double  y  =  x1-x2-c;
                System.out.println("X1:"+x1);
                System.out.println("X2:"+x2);
                System.out.println(y);
            }else if (D==0){
                System.out.println("1 ta ildizga ega");
            }else {
                System.out.println("Ildizga ega emas");
            }


    }
}
