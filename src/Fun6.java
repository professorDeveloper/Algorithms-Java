public class Fun6 {
    public static void main(String[] args) {
        DigitCountSum(1234);
    }
    public static void DigitCountSum(int a){
        int sum=0;
        int count=0;
        for (int temp = a; temp != 0; temp = temp / 10) {
            sum =sum + temp % 10;
            count++;
        }

        System.out.println(sum+", "+count);
    }
}
