package swichcase;

import java.util.Scanner;

public class case17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("number :");
        int number=scanner.nextInt();
        if (number<100 && 0<number){
            decimal(number);
            unit(number);
        }
        else {
            System.err.println("Sonlar oralig`i 1...99");
        }
    }
    public static void unit(int number){
        String str="masala";
        int result =number%10;
        if (number<10){
            switch (number){
                case 1:
                    System.out.println("Birta "+str);
                    break;
                case 2:
                    System.out.println("Ikkita "+str);
                    break;
                case 3 :
                    System.out.println("Uchta "+str);
                    break;
                case 4:
                    System.out.println("to`rtta "+str);
                    break;
                case 5:
                    System.out.println("beshta "+str);
                    break;
                case 6:
                    System.out.println("oltita "+str);
                    break;
                case  7:
                    System.out.println("yettita"+str);
                    break;
                case 8:
                    System.out.println("sakkizta"+str);
                    break;
                case 9:
                    System.out.println("toqqizta "+str);
                    break;
            }
        }
        else {
            switch (result){
                case 1:
                    System.out.println("Birta "+str);
                    break;
                case 2:
                    System.out.println("Ikkita  "+str);
                    break;
                case 3 :
                    System.out.println("Uchta "+str);
                    break;
                case 4:
                    System.out.println("to`rtta "+str);
                    break;
                case 5:
                    System.out.println("beshta "+str);
                    break;
                case 6:
                    System.out.println("oltita  "+str);
                    break;
                case  7:
                    System.out.println("yettita "+str);
                    break;
                case 8:
                    System.out.println("sakkizta  "+str);
                    break;
                case 9:
                    System.out.println("toqqizta  "+str);
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
                    str="masala";
                    System.out.print("o`nta  "+str);
                    break;
                case 2:
                    str="yosh";
                    System.out.print("yigirmata "+str);
                    break;
                case 3 :
                    str="yosh";
                    System.out.print("o`ttizta "+str);
                    break;
                case 4:
                    str="yosh";
                    System.out.print("qiriqta  "+str);
                    break;
                case 5:
                    str="yosh";
                    System.out.print("ellikta  "+str);
                    break;
                case 6:
                    str="yosh";
                    System.out.print("oltmishta  "+str);
                    break;
                case  7:
                    str="yosh";
                    System.out.print("yetmishta "+str);
                    break;
                case 8:
                    str="yosh";
                    System.out.print("sakson ta "+str);
                    break;
                case 9:
                    str="yosh";
                    System.out.print("to`xsonta  "+str);
                    break;
            }
        }
    }
}
