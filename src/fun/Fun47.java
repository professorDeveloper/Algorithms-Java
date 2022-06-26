package fun;

public class Fun47 {
    public static void main(String[] args) {
        frac1 (630, 198);//630/18=35==>198/18=>11
        frac1 (630, 24);//630/6=105==>24/6=>4
        frac1 (630, 84);//
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
    public static void frac1(int g,int h){
        int p=g/EKUB (g,h);
        int q=h/EKUB (g,h);
        System.out.println (p+"/"+q);
    }
}
