package masalaGita80;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("yilni kiriting : ");// 1 2 3 $ 5 6 7 $
        a=scanner.nextInt();//2000
        b=a%100;//1999=99
        d=365;
        e=366;
        c=a%400;//1999-1600=399
        System.out.println (c);
        f=a%4;
        if (b==0){
            if (c==0){
                System.out.println("kabisa yili "  + e +" kun bor");

            }else {
                System.out.println("kabisa yili emas " + d+" kun bor");
            }
        }else {
            if (f==0){
                System.out.println("kabisa yili "  + e +" kun bor");
            }else {
                System.out.println("kabisa yili emas " + d +" kun bor");

            }

        }
    }
}
