package fun;

        public class Fun56 {
            public static void main(String[] args) {
                System.out.printf ("%.2f\n",Leng (1, 1, 2, 6));
                System.out.printf ("%.2f\n",Leng (1, 1, 3, 12));
                System.out.printf ("%.2f\n",Leng (1, 1, 4, 2));
            }
            public static double Leng(double x1,double y1,double x2,double y2){
                double g=Math.sqrt (((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)));
                return g;
            }

}
