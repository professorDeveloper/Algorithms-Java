public class Example4 {
    //  1 - musbat
    // -3   manfiy
    // 0 na musbat na manfiy
    public static void main(String[] args) {
        int n = -2;
        String text;

/*
        if (n > 0) {
            text = "musbat";
        } else if (n == 0) {
            text = "na musbat na manfiy";
        } else {
            text = "manfiy";
        }
*/

        // shartga mos qiymat tanlash
        text = (n > 0) ? "musbat" : (n == 0)
                ? "na musbat na manfiy" : "manfiy";

        System.out.println("Siz kiritgan son " + text);

    }
}
