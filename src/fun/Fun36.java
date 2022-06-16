package fun;

public class Fun36 {
    public static void main(String[] args) {
        System.out.println(Fib(6));//1, 1, 2, 3, 5, 8
        System.out.println(Fib(7));//1, 1, 2, 3, 5, 8, 13
        System.out.println(Fib(10));//  1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        //, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181.
    }

    public static int Fib(int n) {

        int f1 = 1;
        int f2 = 1;
        int f = 0;


        if (n>0){
            for (int i = 2; i < n; i++) {
                f = f2 + f1;//f =2 //1+2 //2+3 //3+5
                f2 = f1;//f2=1 //f2 =2 // f2=3//f2=5
                f1 = f;//2  //f1=3 //f1=5//f1=8
            }
        }else {
            System.out.println("n<0");
        }

        return f;
    }
}
