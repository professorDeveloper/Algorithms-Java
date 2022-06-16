public class Fun15 {
    public static void main(String[] args) {
        ShiftLeft(1, 2, 3);
        ShiftLeft(5,4,3);
    }

    public static void ShiftLeft(int a, int b, int c) {
        int d;
        d = a;//1
        a = b;//2
        b = c;//3
        c = d;//1
        //123 a=2 b=3 c=1
        System.out.print(a);
        System.out.print(b);
        System.out.print(c+"\n");

    }


}
