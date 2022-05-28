package swichcase;

import java.util.Scanner;

public class switch9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        function(30,1);

    }
    public static void function(int day, int month) {


        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31)
                {

                    day = 0;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30)
                {
                    day = 0;
                }
                break;
            case 2:
                if (day == 28)
                {
                    day = 0;
                }
                break;
        }

        if (day == 0)
        {
            if (month== 12)
            {
                month = 1;
            }
            else
            {
                month++;
            }
        }

        day++;
        System.out.printf("Natija : %d.%d\n",day,month);

    }

}
