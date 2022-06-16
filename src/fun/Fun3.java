package fun;

public class Fun3 {
    public static void main(String[] args) {
MEAN(1,2,3,4);
    }
    public static void MEAN (int a,int b,int c,int d){
        int ab=(a+b)/2;
        int ac=(a+c)/2;
        int ad=(a+d)/2;
        int abg= (int) Math.sqrt(a*b);
        int acg= (int) Math.sqrt(a*c);
        int adg= (int) Math.sqrt(a*d);
        System.out.println("ab = "+ab);
        System.out.println("ac = "+ac);
        System.out.println("ad = "+ad);
        System.out.println("abg = "+abg);
        System.out.println("acg = "+acg);
        System.out.println("adg = "+adg);
    }
}
