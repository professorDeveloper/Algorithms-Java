package fun;

public class Fun50 {
    public static void main(String[] args) {
        TimeToHMS (435);
        TimeToHMS (400);
        TimeToHMS (5678);
    }
    public static void TimeToHMS(int t){
            int H=t/3600;
            int M= t%3600/60;
            int S= t%60;
            System.out.printf("%d:%d:%d",H,M,S);
            System.out.println();
    }
}
