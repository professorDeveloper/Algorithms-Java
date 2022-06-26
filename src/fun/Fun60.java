package fun;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/21/2022/ 1:16 AM
 */
public class Fun60 {
        public static void main(String[] args) {
            System.out.printf ("%.2f\n",Heights (4, 22, 43, 3, 5, 3, 2, 4, 5));
            System.out.printf ("%.2f\n",Heights (2, 12, 13, 31, 0.5, 5, 21, 43, 52));
        }
        public static double Heights(double xa,double ya,double xb ,double yb,double xc,double yc,double ha,double hb,double hc){
            ha=dist (xa,ya,xb,yb,xc,yc);
            hb=dist (xa,ya,xb,yb,xc,yc);
            hc=dist (xa,ya,xb,yb,xc,yc);
            return ha+hb+hc;
        }
        public static double dist(double xa, double ya, double xb, double yb, double xp, double yp) {
            double h, a, b, c, s, p;
            a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
            s = Area(xa,ya,xb,yb,xp,yp);
            h = 2 * s / a;
            return h;
        }
        public static double Area(double xa,double ya, double xb,double yb,double xc,double yc){
            double p=Perim(xa,ya,xb,yb,xc,yc);
            double a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
            double b = Math.sqrt((xb-xc) * (xb-xc) + (yb-yc) * (yb-yc));
            double c = Math.sqrt((xc - xa) * (xc - xa) + (yc - ya) * (yc - ya));

            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
        }
        public static double Perim(double xa,double ya, double xb,double yb,double xc,double yc){
            double a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
            double b = Math.sqrt((xb-xc) * (xb-xc) + (yb-yc) * (yb-yc));
            double c = Math.sqrt((xc - xa) * (xc - xa) + (yc - ya) * (yc - ya));
            double p = (a + b + c) / 2;

            return p;
        }

}
