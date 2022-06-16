package fun;

public class Fun26 {
    public static void main(String[] args) {
        System.out.println (IsPower5 (125));
    }
    public static boolean IsPower5(int k){
        int a=5;
        int b=a;

        while (a<k){
            a*=b;
        }
        if ( a==k ){
            return true;
        }else return false;
    }
}
