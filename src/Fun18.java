public class Fun18 {
    public static void main(String[] args) {
        System.out.printf("%.4f\n",Doira(2.4));
        System.out.printf("%.4f\n", Doira(1.3));
        System.out.printf("%.4f\n",Doira(1.7));
    }
    public static double Doira(double r){
        double PI =3.1415;
        double s= PI*(r*r);
        return s;
    }
}
