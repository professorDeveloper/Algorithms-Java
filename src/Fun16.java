import java.security.spec.RSAOtherPrimeInfo;

public class Fun16 {
    public static void main(String[] args) {
        ishora(5);
        ishora(-1);
        ishora(0);
    }
    public static void ishora(int a){
        int b=0;
        if (a>0){
           b= b+1;
            System.out.println(b);
        }else if (a<0){
            b=b-1;
            System.out.println(b);
        }else {
            System.out.println(b);
        }
    }
}
