import java.util.Random;

public class Rand {
    public static void main(String[] args) {
            coinToss(4);
    }
    public static void coinToss(int num){
        Random rd = new Random();
        int x;
        for (int i=0; i<num; i++){
            x=rd.nextInt(2);
            if(x==0) System.out.println("head");
            else System.out.println("Tail");
        }

    }
}
