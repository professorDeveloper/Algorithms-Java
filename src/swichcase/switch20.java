package swichcase;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class switch20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);

        out.println("Oy = ");
        int oy = s.nextInt();
        out.println("Kun = ");
        int kun = s.nextInt();


        switch (oy) {
            case 1 -> {
                if (kun >= 20 && oy >= 1 && oy <= 2) {
                    out.println("Qovg'a");
                }else if (kun<=19&&oy==1){
                    out.println("Echki");
                }
                else {
                    out.println("1");
                }
            }
            case 2 -> {
                if (kun <= 18 && oy >= 1 && oy <= 2) {
                    out.println("Qovg'a");
                } else if (oy <= 3 && oy >= 2&&kun>=19) {
                    out.println("Baliq");
                } else {
                    out.println("2");
                }
            }
            case 3 -> {
                if (kun <= 20 && oy >= 2 && oy <= 3) {
                    out.println("Baliq");
                } else if (kun <= 21 && kun >= 19 && oy >= 3 && oy <= 4) {
                    out.println("Qo'y");
                }
            }
            case 4 -> {
                if (kun <= 21 && kun >= 19 && oy >= 3 && oy <= 4) {
                    out.println("Qo'y");
                } else if (oy <= 5 && oy >= 4 && kun >= 20) {
                    out.println("Buzoq");
                } else {
                    out.println("4");
                }
            }
            case 5 -> {
                if (oy <= 5 && oy >= 4 && kun <= 20) {
                    out.println("Buzoq");
                } else if (oy <= 6 && oy >= 5 && kun >= 21) {
                    out.println("Egizaklar");
                } else {
                    out.println("5");
                }
            }
            case 6 -> {
                if (oy <= 6 && oy >= 5 && kun <= 21) {
                    out.println("Egizaklar");
                } else if (oy <= 7 && oy >= 6 && kun >= 22) {
                    out.println("Qisqichbaqa");
                } else {
                    out.println("6");
                }
            }
            case 7 -> {
                if (oy <= 7 && oy >= 6 && kun <= 22) {
                    out.println("Qisqichbaqa");
                } else if (oy <= 8 && oy >= 7 && kun >= 23) {
                    out.println("Arslon");
                } else {
                    out.println("7");
                }
            }
            case 8 -> {
                if (oy <= 8 && oy >= 7 && kun <= 22) {
                    out.println("Arslon");
                } else if (oy <= 9 && oy >= 8 && kun >= 23) {
                    out.println("Parizod");
                } else {
                    out.println("8");
                }
            } case 9 -> {
                if (oy <= 10 && oy >= 9 && kun <= 22) {
                    out.println("Parizod");
                } else if (oy <= 9 && oy >= 8 && kun >= 23) {
                    out.println("Tarozi");
                } else {
                    out.println("9");
                }
            }
            case 10 -> {
                if (oy <= 11 && oy >= 10 && kun <= 22) {
                    out.println("Tarozi");
                } else if (oy <= 10 && oy >= 9 && kun >= 23) {
                    out.println("Chayon");
                } else {
                    out.println("10");
                }
            }case 11 -> {
                if (oy <= 11 && oy >= 10 && kun >= 23) {
                    out.println("O`qotar");
                } else if (oy ==11 && kun <= 22) {
                    out.println("Chayon");
                } else {
                    out.println("11");
                }
            }
            case 12 -> {
                if (oy <= 12 && oy >= 11 && kun <= 21) {
                    out.println("O'qotar");
                } else if (oy <= 12 && oy >= 11 && kun >= 22) {
                    out.println("Echki");
                } else {
                    out.println("12");
                }
            }



        }
    }
}
