package fun;

public class Fun25 {
    public static void main(String[] args) {
        System.out.println (kuku ( 16));
        System.out.println (kuku ( 4));
        System.out.println (kuku ( 47));
        System.out.println (kuku ( 25));
    }
    public static boolean kuku(double k){//49
        int a;
        a= (int) Math.sqrt (k);//49
        a=a*a;
        if ( a == k ){
            return true;
        }
        return false;
    }
}
