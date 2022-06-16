package funsimple;

public class Fun2 {
    public static void main(String[] args) {
        PowerA234(2);
        PowerA234(3);
        PowerA234(4);
    }
    public static void PowerA234(double a){
        double daraja2=a*a;
        double daraja3=a*a*a;
        double daraja4=a*a*a*a;
        System.out.printf("%.2f ning 2-darjasi %.2f \n",a,daraja2);
        System.out.printf("%.2f ning 3-darjasi %.2f \n",a,daraja3);
        System.out.printf("%.2f ning 4-darjasi %.2f \n",a,daraja4);
    }
}
