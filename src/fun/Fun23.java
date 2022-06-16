package fun;

public class Fun23 {
    public static void main(String[] args) {

        Quarter(2,3);
        Quarter(-2,3);
        Quarter(-2,-3);
        Quarter(2,-3);
        Quarter(0,0);
    }
    public static void Quarter(int x,int y){
        if (x>0 && y>0){
            System.out.println("1-chorag");
        }else if (x<0 && y>0 ){
            System.out.println("2-chorag");
        }else if (x<0 && y<0){
            System.out.println("3-chorag");
        }else if (x>0 && y<0){
            System.out.println("4- chorag");
        }else {
            System.out.println("Bunday chorag yo`q");
        }
    }
}
