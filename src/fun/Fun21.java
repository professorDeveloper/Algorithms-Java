package fun;

public class Fun21 {
    public static void main(String[] args) {
        SumRange(2,5,8);//2+3+4+5+
    }
    public static void SumRange(int a,int b,int c){
        int a1=0;
        int b1=0;
        if (a<b ){
            for (int i = a; i <=b; i++) {
                a1+=i;

            }
            if (b<c){

                for (int i = b; i <=c ; i++) {
                    b1+=i;
                }
            }
            System.out.println(a1+b1);

        }else {
            System.out.println(0);
        }

    }
}
