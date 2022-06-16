package fun;

public class Fun22 {
    public static void main(String[] args) {

        Calc(1,5,2);//a-b=3
        Calc(2,5,2);//a*b=10
        Calc(3,5,2);//a/b=2
        Calc(4,5,2);//a+b=7
    }
    public static void Calc(int Op,int a,int b){
        switch (Op){
            case 1->{
                int N1 =a-b;
                System.out.println("Natija: "+N1);
            }
            case 2->{
                int N2=a*b;
                System.out.println("Natija: "+N2);
            }
            case 3->{
                int N3=a/b;
                System.out.println("Natija: "+N3);

            }
            case  4->{
                int N4=a+b;
                System.out.println("Natija: "+N4);
            }
            default -> {
                System.out.println("Bunday Amal yo`q");
            }

        }
    }
}
