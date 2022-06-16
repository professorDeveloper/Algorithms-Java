package fun;

public class Fun27 {
    public static void main(String[] args) {
        IsPowerN(5,25);//true
        IsPowerN(5,125);//true
        IsPowerN(3,9);//true
        IsPowerN(4,12);//false
        IsPowerN(3,39);//false
    }
    public static void IsPowerN(int n, int k){
        int a=n;
        int b=a;
        while (a<k){
            a*=b;
        }
        if (a==k){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
