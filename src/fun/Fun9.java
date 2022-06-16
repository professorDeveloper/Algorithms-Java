package fun;

public class Fun9 {
    public static void main(String[] args) {
        System.out.println (AddRightDigit (10, 2));//210
        System.out.println (AddRightDigit (1, 2));//21
        System.out.println (AddRightDigit (123, 2));//2123
        System.out.println (AddRightDigit (1231, 2));//21231
    }
    public static int AddRightDigit(int k,int r){
        int rk=0;
        int t=k;
        if ( 1<=r && r <=9 ){
            while (t>0){
                r*=10;
                t/=10;
            }
            rk=r+k;
        }
        return rk;
    }
}
