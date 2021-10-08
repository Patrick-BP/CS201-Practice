package chapter4;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(numvowels("treopuio"));
    }
    public static int numvowels(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e') count++;
            else if(str.charAt(i) == 'i') count++;
            else if(str.charAt(i) == 'u') count++;
            else if(str.charAt(i) == 'a') count++;
            else if(str.charAt(i) == 'o') count++;


        }
        return count;

    }
}
