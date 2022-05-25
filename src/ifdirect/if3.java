package ifdirect;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number:");
        int number=scanner.nextInt();
        if (number>0){
            number++;
            System.out.println(number);
        }else if (number==0){
            number=10;
            System.out.println(number);
        }else {
            number-=2;
            System.out.println(number);
        }
    }
}
