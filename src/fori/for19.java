package fori;

import java.util.Scanner;

public class for19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("n:");
        int n= scanner.nextInt();
        int result=1;
        for (int i = 1; i <=n; i++) {//i =1; chunki hamma sonni 0 ga ko`paytirsak 0 chiqadi

            result*=i;
        }//1*2*3*4*5..*n-> n=biz kiritgan son
        System.out.printf("1 dan %d gacha bo`lgan sonlarning Ko`paytmasi: %d",n,result);
    }
}
