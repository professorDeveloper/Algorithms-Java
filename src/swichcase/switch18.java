package swichcase;

import java.util.Scanner;

public class switch18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Num:");
        int n=scanner.nextInt();
        if (n>99 &&n<1000 ){
            int hundred=n/100;
            int decimal=(n%100)/10;
            int unit= (n%100)%10;
            result(hundred,decimal,unit);
        }
        else {
            System.err.println("Son oralig`i 100...999 ! ");
        }
    }

    private static void result(int hundred,int decimal,int unit) {






        switch (hundred){
            case 1:
                System.out.print("yuz " );
            break;
            case 2:
                System.out.print("ikki yuz  ");
                break;
            case 3:
                System.out.print("uch yuz  ");
                break;
            case 4:
                System.out.print("to`rt yuz ");
                break;
            case 5:
                System.out.print("besh yuz ");
                break;
            case 6:
                System.out.print("olti yuz ");
                break;
            case 7:
                System.out.print(" yetti yuz ");
                break;
            case 8:
                System.out.print("sakkiz yuz ");
                break;
            case 9:
                System.out.print("to`qqiz yuz ");break;
        }

        switch (decimal){
            case 1:
                System.out.print("o`n " );
                break;
            case 2:
                System.out.print("yigirma  ");
                break;
            case 3:
                System.out.print("o`ttiz  ");
                break;
            case 4:
                System.out.print("qiriq ");
                break;
            case 5:
                System.out.print("elik ");
                break;
            case 6:
                System.out.print("oltmish ");
                break;
            case 7:
                System.out.print("yetmish  ");
                break;
            case 8:
                System.out.print("sakson ");
                break;
            case 9:
                System.out.print("to`xson ");break;
        }
        switch (unit){
            case 1:
                System.out.print("Bir " );
                break;
            case 2:
                System.out.print("Ikki ");
                break;
            case 3:
                System.out.print("Uch ");
                break;
            case 4:
                System.out.print("To`rt");
                break;
            case 5:
                System.out.print("besh ");
                break;
            case 6:
                System.out.print("olti");
                break;
            case 7:
                System.out.print("yetti ");
                break;
            case 8:
                System.out.print("sakkiz");
                break;
            case 9:
                System.out.print("to`qqiz");break;
        }

    }

}
