package fun;

public class Fun29 {
    public static void main(String[] args) {

        System.out.println(DigitCount(2333));
        System.out.println(DigitCount(234));
        System.out.println(DigitCount(12));
        System.out.println(DigitCount(9));
    }
    public static int DigitCount(int k){
        int count=0;
//        k=k*10;
        for (int i = 0; i <=k ; i++) {// 1234
                k/=10;
                count++;
        }
        return  count;
    }
}
