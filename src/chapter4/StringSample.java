package chapter4;

public class StringSample {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = word1.substring(0, 2);
        String word3 = word1.replace('j', 'w');
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }

}
