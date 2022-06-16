public class Fun19 {
    public static void main(String[] args) {

    }
    public static void   RingS(double r1,double r2){
        double PI =3.1415;
        double s1=0.0;
        double s2=0.0;
        if (r1!=r2){
            s1= PI*(r1*1);
            s2= PI*(r2*1);
            System.out.printf("%.4f",Math.abs(s1 - s2));

        }

    }
}
