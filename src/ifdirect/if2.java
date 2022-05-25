package ifdirect;

import java.util.Enumeration;
import java.util.Scanner;

class if2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if (number>0){
            number++;
            System.out.println(number);
        }else {
            number-=2;
            System.out.println(number);
        }
    }

}