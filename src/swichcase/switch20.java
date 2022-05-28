package swichcase;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class switch20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(in);

        int d;
        int m;
        System.out.print("kun:");
        d = s.nextInt();

        System.out.print("oy:");
        m = s.nextInt();

        switch (m)
        {
            case 1:
                if (d>31 || d<0 ){

                    System.out.println("Bunday kun yo`q");
                }else if (d > 19){
                    System.out.print("Qovg`a");

                }else
                {
                    System.out.print("Echki");
                }
                break;
            case 2:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }      else if (d > 18)
                {
                    System.out.print("Baliq");
                }
                else
                {
                    System.out.print("Qovg`a");
                }
                break;
            case 3:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }    else  if (d > 20)
                {
                    System.out.print("Qo`y");
                }
                else
                {
                    System.out.print("Baliq");
                }
                break;
            case 4:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }      else if (d > 19)
                {
                    System.out.print("Buzoq");
                }
                else
                {
                    System.out.print("Qo`y");
                }
                break;
            case 5:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }    else   if (d > 20)
                {
                    System.out.print("Egizaklar");
                }
                else
                {
                    System.out.print("Buzoq");
                }
                break;
            case 6:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }   else  if (d > 21)
                {
                    System.out.print("Qisqichbaqa");
                }
                else
                {
                    System.out.print("Egizaklar");
                }
                break;
            case 7:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }    else  if (d > 22)
                {
                    System.out.print("Arslon");
                }
                else
                {
                    System.out.print("Qisqichbaqa");
                }
                break;
            case 8:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }     else  if (d > 22)
                {
                    System.out.print("Parizod");
                }
                else
                {
                    System.out.print("Arslon");
                }
                break;
            case 9:
                if (d>31 || d<0){

                    System.out.println("Bunday kun yo`q");
                }  else if (d > 22)
                {
                    System.out.print("Tarozi");
                }
                else
                {
                    System.out.print("Parizod");
                }
                break;
            case 10:
                if (d>31 && d<0){

                    System.out.println("Bunday kun yo`q");
                }   else if (d > 22)
                {
                    System.out.print("Chayon");
                }
                else
                {
                    System.out.print("Tarozi");
                }
                break;
            case 11:
                if (d>31 && d<0){

                    System.out.println("Bunday kun yo`q");
                }  else if (d > 22)
                {
                    System.out.print("O`qotar");
                }
                else
                {
                    System.out.print("Chayon");
                }
                break;
            case 12:
                if (d>31 && d<0){

                    System.out.println("Bunday kun yo`q");
                }   else if (d > 21)
                {
                    System.out.print("Echki");
                }
                else
                {
                    System.out.print("O`qotar");
                }
                break;
        }


    }
}
