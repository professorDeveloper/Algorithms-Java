package fun;

public class Fun51 {
    public static void main(String[] args) {
        IncTime (1,40,30,3600);
    }
    public static void IncTime(int h,int m,int s,int t){
        h*=60*60;
        m*=60;
        t+=h+m+s;
        int H=t/3600;
        int M=t%3600/60;
        int S=t%60;
        System.out.printf("%02d:%02d:%02d",H,M,S);
        System.out.println();
    }
}
