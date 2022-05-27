package swichcase;

import java.util.Scanner;

public class case16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("number :");
        int number=scanner.nextInt();
        if (number<69 && 21<number){
            decimal(number);
            unit(number,"yosh");
        }
        else {
            System.err.println("Sonlar oralig`i 1...99");
        }
    }
    public static void unit(int number,String str){
        int result =number%10;
        if (number<10){
        switch (number){
            case 1:
                System.out.println("Bir  "+str);
                break;
            case 2:
                System.out.println("Ikki  "+str);
                break;
            case 3 :
                System.out.println("Uch  "+str);
                break;
            case 4:
                System.out.println("to`rt  "+str);
                break;
                case 5:
                System.out.println("besh  "+str);
                break;
            case 6:
                System.out.println("olti  "+str);
                break;
            case  7:
                System.out.println("yetti "+str);
                break;
            case 8:
                System.out.println("sakkiz "+str);
                break;
            case 9:
                System.out.println("toqqiz  "+str);
                break;
        }
        }
        else {
            switch (result){
                case 1:
                    System.out.println("Bir  "+str);
                    break;
                case 2:
                    System.out.println("Ikki  "+str);
                    break;
                case 3 :
                    System.out.println("Uch  "+str);
                    break;
                case 4:
                    System.out.println("to`rt "+str);
                    break;
                case 5:
                    System.out.println("besh "+str);
                    break;
                case 6:
                    System.out.println("olti "+str);
                    break;
                case  7:
                    System.out.println("yetti "+str);
                    break;
                case 8:
                    System.out.println("sakkiz "+str);
                    break;
                case 9:
                    System.out.println("toqqiz  "+str);
                    break;
            }
        }
    }
    public static void decimal(int number ){
        String str;
        int result=number/10;
        int result1 =number%10;
        if (result1!=0){
        switch (result){

            case 1:
                System.out.print("o`n  ");
                break;
            case 2:
                System.out.print("yigirma  ");
                break;
            case 3 :
                System.out.print("o`ttiz  ");
                break;
            case 4:
                System.out.print("qiriq ");
                break;
                case 5:
                System.out.print("ellik ");
                break;
            case 6:
                System.out.print("oltmish ");
                break;
            case  7:
                System.out.print("yetmish ");
                break;
            case 8:
                System.out.print("sakson ");
                break;
            case 9:
                System.out.print("to`xson ");
                break;
        }
        }
        else {
            switch (result){
                case 1:
                    str="yosh";
                    System.out.print("o`n  "+str);
                    break;
                case 2:
                    str="yosh";
                    System.out.print("yigirma  "+str);
                    break;
                case 3 :
                    str="yosh";
                    System.out.print("o`ttiz  "+str);
                    break;
                case 4:
                    str="yosh";
                    System.out.print("qiriq "+str);
                    break;
                case 5:
                    str="yosh";
                    System.out.print("ellik "+str);
                    break;
                case 6:
                    str="yosh";
                    System.out.print("oltmish "+str);
                    break;
                case  7:
                    str="yosh";
                    System.out.print("yetmish "+str);
                    break;
                case 8:
                    str="yosh";
                    System.out.print("sakson "+str);
                    break;
                case 9:
                    str="yosh";
                    System.out.print("to`xson "+str);
                    break;
            }
        }
    }
}
