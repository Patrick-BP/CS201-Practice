package chapter4;

public class WordsCounter {
    public static void main(String[] args) {

        System.out.println(wordsCounter("I love Miu"));
    }
    public static int wordsCounter(String sentince){
        int counter=1;
        for(int i=0; i<sentince.length(); i++){
            if(sentince.charAt(i) == ' ' ){
                counter++;
            }

        }

        return counter;

    }
}
