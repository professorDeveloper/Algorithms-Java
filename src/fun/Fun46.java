package fun;

public class Fun46 {
    public static void main(String[] args) {
        EKUB (24,18);//A=B
        EKUB (630,198);//A=C
        EKUB (240,180);//A=D
    }
    public static void EKUB(int a,int b){//24 va 18
        int max=Integer.MIN_VALUE;//-2.000.000.
        int t,m=0,e=0;
        int tb,mb=0;
        for (int i = 1; i <= a; i++) {
            t=a%i;//24%3=0
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
        System.out.println (max);
    }
}
