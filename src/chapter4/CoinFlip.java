package chapter4;

import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        coinToss(4);
    }
    public static void coinToss(int n){
        Random rand = new Random();
        for(int i=0; i<n; i++){
            System.out.println(rand);
        }

    }
}
