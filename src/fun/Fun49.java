package fun;

public class Fun49 {
    public static void main(String[] args) {
        EKUB (8, 16, 24);
    }
    public static void EKUB(int a, int b, int c) {//24 va 18
        int max = Integer.MIN_VALUE;//-2.000.000.
        int t, m = 0, e = 0;
        int tb, mb = 0;
        int tc, mc = 0;
        for (int i = 1; i <= a; i++) {
            t = a % i;//24%3=0
            if ( t == 0 ) {
                m = i;
            }
            for (int j = 1; j <= b; j++) {
                tb = b % j;//
                if ( tb == 0 ) {
                    mb = j;
                }
                for (int k = 1; k <= c; k++) {
                    tc = c % k;
                    if ( tc == 0 ) {
                        mc = k;
                    }
                    if ( m == mb && mb == mc ) {
                        e = m;
                    }
                    if ( max < e ) {
                        max = e;
                    }
                }
            }
        }
        System.out.println (max);
    }
}
