package funsimple;

public class Fun1 {
    public static void main(String[] args) {
        PowerA3(3);
        PowerA3(6);
        PowerA3(9);
        PowerA3(27);
    }
    public static void PowerA3(int a){
        int b=a*a*a;
        System.out.printf("%d sonning 3-darajasi %d \n ",a,b);
    }
}
