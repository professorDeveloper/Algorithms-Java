package swichcase;

import java.util.Scanner;

public class switch11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int k1,k2;
        System.out.print ("C^:");
        char c=scanner.next().charAt (0);
        System.out.print ("K1:" );
        k1=scanner.nextInt ();
        System.out.print ("K2:" );
        k2=scanner.nextInt ();
        lokation (c,k1,k2);
    }
    public static void lokation (char c,int k1,int k2){
        String sh="Shmol";
        String j="Janub";
        String g="Garb";
        String q="Sharq";
        String result="";
        switch (k1){
            case 0->{
                switch (c){
                    case 's' -> result = q;
                    case 'j' ->result=g;
                    case 'g'->result=sh;
                    case 'q'->result=j;

                }System.out.println ("K1:"+result);
                switch (k2){
                    case 0->{
                        switch (c){
                            case 's' -> result = j;
                            case 'j' ->result=sh;
                            case 'g'->result=q;
                            case 'q'->result=g;
                        }
                    }
                    case 1->{
                        switch (c){
                            case 's' -> result = sh;
                            case 'j' ->result=j;
                            case 'g'->result=g;
                            case 'q'->result=q;
                        }
                    }
                    case 2->{
                        switch (c){
                            case 's' -> result = g;
                            case 'j' ->result=q;
                            case 'g'->result=j;
                            case 'q'->result=sh;
                        }
                    }
                }
            }
            case 1->{
                switch (c){
                    case 's' -> result = g;
                    case 'j' ->result=q;
                    case 'g'->result=j;
                    case 'q'->result=sh;
                }System.out.println ("K1:"+result);
                switch (k2){
                    case 0->{
                        switch (c){
                            case 's' -> result = sh;
                            case 'j' ->result=j;
                            case 'g'->result=g;
                            case 'q'->result=q;
                        }
                    }
                    case 1->{
                        switch (c){
                            case 's' -> result = j;
                            case 'j' ->result=sh;
                            case 'g'->result=q;
                            case 'q'->result=g;
                        }
                    }
                    case 2->{
                        switch (c){
                            case 's' -> result = q;
                            case 'j' ->result=g;
                            case 'g'->result=sh;
                            case 'q'->result=j;
                        }
                    }
                }
            }
            case 2->{
                switch (c){
                    case 's' -> result = j;
                    case 'j' ->result=sh;
                    case 'g'->result=q;
                    case 'q'->result=g;
                }System.out.println ("K1:"+result);
                switch (k2){
                    case 0->{
                        switch (c){
                            case 's' -> result = g;
                            case 'j' ->result=q;
                            case 'g'->result=j;
                            case 'q'->result=sh;
                        }
                    }
                    case 1->{
                        switch (c){
                            case 's' -> result =q;
                            case 'j' ->result=g;
                            case 'g'->result=sh;
                            case 'q'->result=j;
                        }
                    }
                    case 2->{
                        switch (c){
                            case 's' -> result = sh;
                            case 'j' ->result=j;
                            case 'g'->result=g;
                            case 'q'->result=q;
                        }
                    }
                }
            }

        }
        System.out.println (result);
    }

}
