package Exam;

public class Findavowel {
    public static void main(String[] args) {
        String sentence = "We are happy people";
        String name = "lalaland";

        int firstA = name.indexOf('a');
        int secondA = name.indexOf('a',firstA+1);
        System.out.println(firstA);
        System.out.println(secondA);
    }
    public static char findMiddleChar(String word){
        int middleIndex = word.length()/2;
        return word.charAt(middleIndex);
    }


}
