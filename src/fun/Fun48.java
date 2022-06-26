package fun;

public class Fun48 {
    public static void main(String[] args) {
        System.out.println (EKUB (6, 8));
        EKUK (6,8);
    }
    public static int EKUB(int a,int b){//24 va 18
        int max=Integer.MIN_VALUE;//
        int t,m=0,e=0;
        int tb,mb=0;
        for (int i = 1; i <= a; i++) {
            t=a%i;//
            if (t==0){
                m=i;
            }
            for (int j = 1; j <=b ; j++) {
                tb=b%j;//
                if ( tb==0 ){
                    mb=j;
                }
                if ( m==mb ){
                    e=m;
                }
                if (max<e ){
                    max=e;
                }
            }
        }
        return max;//max=>18
    }
    public static void EKUK(int g,int h){
        int p=g*h/EKUB (g,h);
        System.out.println (p);
    }
}
