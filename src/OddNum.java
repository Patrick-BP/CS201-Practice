public class OddNum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int x){
        int sum=0;
        for(int i=1; i<=x;i++) {
            if (!(i % 2 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
}
